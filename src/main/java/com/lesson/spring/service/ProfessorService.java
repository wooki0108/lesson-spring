package com.lesson.spring.service;

import com.lesson.spring.api.professor.request.CreateProfessorRequest;
import com.lesson.spring.api.professor.request.UpdateProfessorRequest;
import com.lesson.spring.api.professor.response.ProfessorResponse;
import com.lesson.spring.entity.Professor;
import com.lesson.spring.repository.ProfessorRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProfessorService {

    private final ProfessorRepository professorRepository;

    @Transactional
    public void save(CreateProfessorRequest request) {

        Professor professor = Professor.builder()
                .name(request.getName())
                .build();

        professorRepository.save(professor);
    }

    public List<ProfessorResponse> findAll() {

        List<Professor> professors = professorRepository.findAll();

        return professors.stream().map((professor) -> ProfessorResponse.builder()
                .id(professor.getId())
                .name(professor.getName())
                .build()
        ).toList();
    }

    public List<ProfessorResponse> findByName(String name) {

        List<Professor> findProfessorByName = professorRepository.findByName(name);

        if (findProfessorByName.isEmpty()) {
            throw new IllegalArgumentException("존재하지 않은 교수님 입니다.");
        }

        return findProfessorByName.stream().map(professor -> ProfessorResponse.builder()
                .id(professor.getId())
                .name(professor.getName())
                .build()
        ).toList();

    }

    @Transactional
    public void update(Long professorId, UpdateProfessorRequest request) {
        Professor findProfessor = findById(professorId);
        findProfessor.changeName(request.getName());
        professorRepository.save(findProfessor);
    }

    @Transactional
    public Professor findById(Long professorId) {
        Professor findProfessor = professorRepository.findById(professorId);
        return findProfessor;
    }

    @Transactional
    public void delete(Long professorId) {
        Professor findProfessor = findById(professorId);
        professorRepository.delete(findProfessor.getId());
    }
}
