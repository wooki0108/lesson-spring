package com.lesson.spring.service;

import com.lesson.spring.api.lesson.request.CreateLessonDetailRequest;
import com.lesson.spring.api.lesson.request.CreateLessonRequest;
import com.lesson.spring.api.lesson.request.UpdateProfessorLessonRequest;
import com.lesson.spring.api.lesson.response.LessonView;
import com.lesson.spring.entity.Lesson;
import com.lesson.spring.entity.LessonDetail;
import com.lesson.spring.entity.Professor;
import com.lesson.spring.repository.LessonProfessorRepository;
import com.lesson.spring.repository.LessonRepository;
import com.lesson.spring.repository.ProfessorRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LessonService {

    private final LessonRepository lessonRepository;
    private final ProfessorRepository professorRepository;
    private final LessonProfessorRepository lessonProfessorRepository;

    @Transactional
    public void save(Long professorId, CreateLessonRequest request) {
        Professor findProfessor = professorRepository.findById(professorId);
        //TODO: 예외 발생시키기

        // TODO : 주석 남기기(변환, 어렵)
        Lesson lesson = Lesson.builder()
                .name(request.getName())
                .build();

        for (CreateLessonDetailRequest detailRequest : request.getCreateLessonDetailRequests()) {
            LessonDetail lessonDetail = LessonDetail.builder()
                    .content(detailRequest.getContent())
                    // week
                    .build();
            lesson.addLessonDetail(lessonDetail);
        }

        lessonRepository.save(lesson);
        lessonProfessorRepository.save(lesson, findProfessor);
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
