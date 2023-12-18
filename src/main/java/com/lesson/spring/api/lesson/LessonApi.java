package com.lesson.spring.api.lesson;

import com.lesson.spring.entity.Lesson;
import com.lesson.spring.service.LessonService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/lesson")
public class LessonApi {

    private final LessonService lessonService;

    // 수업 전체 조회
    @GetMapping("/finds")
    public List<Lesson> findLesson() {
        List<Lesson> lesson = lessonService.findLesson();
        return lesson;
    }
    //1. 교수 강의 등록

    //2. 교수가 등록한 강의 수정

    //3. 교수가 등록한 강의 삭제

    //4. 수업 전체 조회

    //5. 수업 이름으로 검색

    //6. 교수 이름으로 수업 검색


}
