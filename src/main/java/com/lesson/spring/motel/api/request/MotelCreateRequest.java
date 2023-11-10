package com.lesson.spring.motel.api.request;

import lombok.Getter;

@Getter
public class MotelCreateRequest {

    private final String name;
    private final int price;

    public MotelCreateRequest(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
