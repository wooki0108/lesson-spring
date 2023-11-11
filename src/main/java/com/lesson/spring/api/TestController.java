package com.lesson.spring.api;

import com.lesson.spring.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    @PersistenceContext
    private final EntityManager entityManager;

    @Transactional
    @GetMapping("/")
    public void test(){
        Member member = new Member();
        member.setName("뉴뉴");
        System.out.println(entityManager);
        entityManager.persist(member);
    }
}
