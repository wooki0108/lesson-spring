package com.lesson.spring.api.professor.response;

import com.lesson.spring.entity.Professor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfessorResponse {

    private Long id;
    private String name;

    public static ProfessorResponse response(Professor professor) {
        return new ProfessorResponse(professor.getId(), professor.getName());
    }

}
