package com.project.foryourskintype.repository;

import com.project.foryourskintype.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class JPAMemberRepositoryTest {
    @PersistenceContext
    EntityManager em;

    @Test
    public void 지연로딩(){
        Member findMember = em.find(Member.class, 1L);

    }
}