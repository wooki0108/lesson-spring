package com.lesson.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Lesson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "lesson")
    private List<LessonProfessor> professor = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "lesson_id")
    private List<LessonDetail> lessonDetails = new ArrayList<>();

    @OneToMany(mappedBy = "lesson")
    private List<StudentLesson> studentLessons = new ArrayList<>();



}
