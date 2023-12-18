package com.lesson.spring.api.professor;

import com.lesson.spring.api.professor.request.EnrollLessonRequest;
import com.lesson.spring.entity.Lesson;
import com.lesson.spring.service.LessonService;
import com.lesson.spring.service.ProfessorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/professor")
public class ProfessorApi {

    private final ProfessorService professorService;
    private final LessonService lessonService;

    // 교수가 강의를 등록
    @PostMapping("/save")
    public EnrollLessonRequest saveLesson(@RequestBody Lesson lesson) {
        lessonService.save(lesson);
        return new EnrollLessonRequest(lesson.getName());
    }


}
