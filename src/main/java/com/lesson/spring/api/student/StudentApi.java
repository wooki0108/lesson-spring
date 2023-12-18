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


    //1. 학생 등록

    //2. 전체 학생 조회

    //3. 학생 이름으로 조회

    //4. 학생 정보 수정

    //5. 힉셍 자퇴



}
