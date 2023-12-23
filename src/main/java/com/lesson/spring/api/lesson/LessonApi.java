package com.lesson.spring.api.lesson;

import com.lesson.spring.api.lesson.request.CreateLessonRequest;
import com.lesson.spring.api.lesson.request.UpdateProfessorLessonRequest;
import com.lesson.spring.api.lesson.response.LessonView;
import com.lesson.spring.service.LessonService;
import com.lesson.spring.service.ProfessorService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/lessons")
public class LessonApi {
    private final LessonService lessonService;

    //1. 교수 강의 등록
    @PostMapping
    public LessonView saveLesson(
            @RequestBody CreateLessonRequest request) {
        lessonService.save(request);
        return new LessonView(request.getName());
    }

    //2. 등록한 강의 수정
    @PutMapping("/{lessonId}")
    public LessonView updateLesson(
            @PathVariable Long lessonId,
            @RequestBody UpdateProfessorLessonRequest request) {

        lessonService.updateLesson(lessonId, request);
        return new LessonView();
    }

    //3. 등록한 강의 삭제
    @DeleteMapping("/{lessonId}")
    public LessonView deleteLesson(@PathVariable Long lessonId) {
        lessonService.deleteLesson(lessonId);
        return new LessonView();
    }

    //4. 수업 전체 조회
    @GetMapping()
    public List<LessonView> findAllLessons() {
        return lessonService.findAll();
    }

    //5. 수업 이름으로 검색
    @GetMapping("/search")
    public List<LessonView> findByName(@RequestParam String name) {
        return lessonService.findByName(name);
    }

    //6. 교수 이름으로 수업 검색


}
