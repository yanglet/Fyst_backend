package com.project.foryourskintype.service;

import com.project.foryourskintype.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class JPAMemberServiceTest {

    @Autowired
    EntityManager em;
    @Autowired
    MemberService memberService;

    @Test
    @Transactional(readOnly = true)
    public void 읽기전용테스트(){
        em.clear();

        Member findMember = memberService.findByName("양글렛");
        findMember.setGender("woman");

        em.flush();
    }

}