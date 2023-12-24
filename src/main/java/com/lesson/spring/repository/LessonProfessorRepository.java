package com.lesson.spring.repository;

import com.lesson.spring.entity.Lesson;
import com.lesson.spring.entity.LessonProfessor;
import com.lesson.spring.entity.Professor;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class LessonProfessorRepository {

    private final EntityManager em;

    public void save(Lesson lesson, Professor professor) {
        em.persist(new LessonProfessor(lesson, professor));
    }




}
