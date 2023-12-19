package com.lesson.spring.api.professor.request;

import lombok.Data;

@Data
public class EnrollLessonRequest {

    private String name;

    public EnrollLessonRequest(String name) {
        this.name = name;
    }
}
