package com.lesson.spring.api.professor;

import com.lesson.spring.api.professor.request.EnrollLessonRequest;
import com.lesson.spring.api.professor.response.EnrollLessonResponse;
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
    public EnrollLessonResponse saveLesson(@RequestBody Lesson lesson) {
        lessonService.save(lesson);
        return new EnrollLessonResponse(lesson.getName());
    }

    //1. 교수 가입

    //2. 교수 전체 조회

    //3. 교수 이름으로 조회

    //4. 교수 정보 수정

    //5. 교수 은퇴


}
