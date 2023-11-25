package com.lesson.spring.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Enrolment {

    @Id
    private Long id;

    private String EnrolmentNo;


}
