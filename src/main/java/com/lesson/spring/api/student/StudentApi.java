package com.lesson.spring.api.student;

import com.lesson.spring.service.LessonService;
import com.lesson.spring.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/student")
public class StudentApi {

    private final StudentService studentService;
    private final LessonService lessonService;

    // 학생 수강 신청




    // 학생이 신청한 수강 과목 조회



}
