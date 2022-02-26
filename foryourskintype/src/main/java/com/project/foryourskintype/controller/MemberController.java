package com.project.foryourskintype.controller;

import com.project.foryourskintype.domain.Member;
import com.project.foryourskintype.dto.*;
import com.project.foryourskintype.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@Transactional
@CrossOrigin("*")
public class MemberController {

    private final MemberService memberService;

    @GetMapping("members/only")
    public Result readAll() { //모든 회원 정보 조회 API (장바구니 정보 미포함)
        List<MemberDto> collect = memberService.findAll()
                .stream()
                .map(MemberDto::new)
                .collect(Collectors.toList());

        return new Result(collect);
    }

    @GetMapping("members") //모든 회원 정보 조회 API (장바구니 정보 포함)
    public Result readByMember() {
        List<MemberWithLikedItem> collect = memberService.findWithLikedItems()
                .stream()
                .map(MemberWithLikedItem::new)
                .collect(Collectors.toList());
        return new Result(collect);
    }

    @GetMapping("mypage") //마이페이지 API
    public Result readMyPage(HttpSession session){
        return new Result(new MemberMyPageResponse(memberService.findByEmail(session.getAttribute("key").toString())));
    }

    @PostMapping("signup") //회원가입 API
    public Result join(@RequestBody @Validated MemberDto memberDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return new Result(bindingResult);
        }
        return new Result(memberService.join(new Member(memberDto.getId(),
                memberDto.getName(),
                memberDto.getGender(),
                memberDto.getEmail(),
                memberDto.getPassword(),
                memberDto.getPhoneNumber())));
    }


    @PostMapping("login") //로그인 API
    public Result login(@RequestBody MemberLoginRequest memberLoginRequest, HttpServletRequest request) {
        //클라이언트랑 변수 맞춘것 Email, Password라고 보면됨
        int loginNum = memberService.Login(memberLoginRequest.getUserId(), memberLoginRequest.getUserPwLogin(), request);
        Member findMember = memberService.findByEmail(memberLoginRequest.getUserId());

        return new Result(new MemberLoginResponse(findMember));
    }
    
    @GetMapping("logout")
    public void logout(HttpSession session){
        session.invalidate();
    }
}