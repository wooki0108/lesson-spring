package com.lesson.spring.domain;

import jakarta.persistence.*;
import lombok.Getter;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.JoinFormula;

import java.util.List;

@Getter
@Entity
@Table(name = "lesson")
public class Lesson {

    @Id
    private Long id;

    private String no;

    private String name;

    private String classroom;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "lesson_id")
    private List<LessonDetail> lessonDetails;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            joinColumns = @JoinColumn(name = "lesson_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private List<Student> students;

}
