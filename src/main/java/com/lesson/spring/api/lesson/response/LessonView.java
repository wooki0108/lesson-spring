package com.lesson.spring.api.lesson.response;

import com.lesson.spring.entity.Lesson;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class LessonView {

    private String name;

    public static LessonView response(Lesson lesson) {
        return new LessonView(lesson.getName());
    }
}
