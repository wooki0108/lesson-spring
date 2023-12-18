package com.lesson.spring.api.professor.request;

import lombok.Data;

@Data
public class EnrollLessonRepoonse {

    private String name;

    public EnrollLessonRepoonse(String name) {
        this.name = name;
    }
}
