package com.lesson.spring.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "professor")
public class Professor {

    @Id
    private Long id;

    private String no;

    private String name;

}
