package com.lesson.spring.api.student.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class StudentResponse {

    private Long id;
    private String name;

}
