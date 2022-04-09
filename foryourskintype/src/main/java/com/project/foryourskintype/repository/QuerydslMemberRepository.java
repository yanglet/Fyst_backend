package com.project.foryourskintype.repository;


import com.project.foryourskintype.domain.Member;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

import static com.project.foryourskintype.domain.QItem.*;
import static com.project.foryourskintype.domain.QLikedItem.*;
import static com.project.foryourskintype.domain.QMember.*;

@Transactional
@RequiredArgsConstructor
public class QuerydslMemberRepository implements MemberRepository {

    private final EntityManager em;
    private final JPAQueryFactory queryFactory;

    @Override
    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    @Override
    public Optional<Member> findById(Long id) {
        return queryFactory.selectFrom(member)
                .where(member.id.eq(id))
                .fetch()
                .stream()
                .findAny();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return queryFactory.selectFrom(member)
                .where(member.name.eq(name))
                .fetch()
                .stream()
                .findAny();
    }

    @Override
    public Optional<Member> findByEmail(String email) {
        return queryFactory.selectFrom(member)
                .where(member.email.eq(email))
                .fetch()
                .stream()
                .findAny();
    }

    @Override
    public List<Member> findAll() {
        return queryFactory.selectFrom(member)
                .fetch();
    }

    @Override
    public List<Member> findWithLikedItems() {
        return queryFactory.selectFrom(member).distinct()
                .join(member.likedItems, likedItem).fetchJoin()
                .join(likedItem.item, item).fetchJoin()
                .fetch();
    }

    @Override
    public void delete(Long id) {
        queryFactory.delete(member)
                .where(member.id.eq(id));
    }

}
