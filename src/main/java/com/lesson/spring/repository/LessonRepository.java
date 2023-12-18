package com.lesson.spring.repository;

import com.lesson.spring.entity.Lesson;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
public class LessonRepository {

    private final EntityManager em;

    @Transactional
    public void save(Lesson lesson) {
        em.persist(lesson);
    }
}
