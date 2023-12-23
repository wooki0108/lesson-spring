package com.lesson.spring.service;

import com.lesson.spring.api.lesson.request.CreateLessonRequest;
import com.lesson.spring.api.lesson.request.UpdateProfessorLessonRequest;
import com.lesson.spring.api.lesson.response.LessonView;
import com.lesson.spring.entity.Lesson;
import com.lesson.spring.entity.LessonDetail;
import com.lesson.spring.entity.Week;
import com.lesson.spring.repository.LessonDetailRepository;
import com.lesson.spring.repository.LessonRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LessonService {

    private final LessonRepository lessonRepository;
    private final LessonDetailRepository lessonDetailRepository;

    @Transactional
    public void save(CreateLessonRequest request) {
        Lesson lesson = Lesson.builder()
                .name(request.getName())
                .build();

        lessonRepository.save(lesson);

        request.getLessonDetails().forEach(((lessonDetail) -> {
            LessonDetail lessonDetails = LessonDetail.builder()
                    .content(lessonDetail.getContent())
                    .week(Week.FIRST)
                    .build();
            lessonDetailRepository.save(lessonDetails);
        }));
    }

    @Transactional
    public void updateLesson(Long lessonId, UpdateProfessorLessonRequest request) {
        Lesson findLesson = lessonRepository.findById(lessonId);
        findLesson.changeName(request.getName());
    }


    @Transactional
    public void deleteLesson(Long lessonId) {
        Lesson lesson = lessonRepository.findById(lessonId);
        lessonRepository.deleteLesson(lesson.getId());
    }

    public List<LessonView> findAll() {
        List<Lesson> lessons = lessonRepository.findAll();

        return lessons.stream()
                .map(lesson -> LessonView.from(lesson))
                .toList();
    }

    public List<LessonView> findByName(String name) {
        List<Lesson> lessons = lessonRepository.findByName(name);

        return lessons.stream().map(
                lesson -> LessonView.from(lesson)
        ).toList();
    }

}
