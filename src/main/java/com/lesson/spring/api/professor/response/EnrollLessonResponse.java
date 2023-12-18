package com.lesson.spring.api.professor.response;

import lombok.Data;

@Data
public class EnrollLessonResponse {

    private String name;

    public EnrollLessonResponse(String name) {
        this.name = name;
    }

}
