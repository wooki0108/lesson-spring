package com.lesson.spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "lesson_detail")
public class LessonDetail {

    @Id
    private Long id;

    private int week;

    private String content;

}
