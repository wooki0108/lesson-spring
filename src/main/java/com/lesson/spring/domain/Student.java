package com.lesson.spring.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
@Table(name = "student")
public class Student {

    @Id
    private Long id;

    private String no;

    private String name;
//
//    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "students")
//    private List<Lesson> lessons;
}
