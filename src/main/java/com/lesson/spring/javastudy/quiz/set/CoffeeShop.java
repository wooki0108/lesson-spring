package com.lesson.spring.javastudy.quiz.set;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString
@EqualsAndHashCode
public class CoffeeShop {

    private String name;
    private String location;

    public CoffeeShop(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
