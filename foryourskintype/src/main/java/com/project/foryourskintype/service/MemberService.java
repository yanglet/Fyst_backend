package com.project.foryourskintype.service;
import com.project.foryourskintype.domain.Member;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

public interface MemberService {
    Long save(Member member);
    Member findById(Long id);
    Member findByName(String name);
    Member findByEmail(String email);
    Long join(Member member);
    int Login(String email, String password, HttpServletRequest request);
    List<Member> findAll();
    List<Member> findWithLikedItems();
    void delete(Long id);
}