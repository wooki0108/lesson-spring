package com.lesson.spring.service;

import com.lesson.spring.entity.Lesson;
import com.lesson.spring.repository.LessonRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LessonService {

    private final LessonRepository lessonRepository;

    @Transactional
    public void save(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public List<Lesson> findLesson() {
        List<Lesson> lesson = lessonRepository.findLesson();
        return lesson;
    }
}
