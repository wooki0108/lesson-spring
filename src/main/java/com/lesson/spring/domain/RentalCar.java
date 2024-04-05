package com.lesson.spring.domain;

import lombok.EqualsAndHashCode;

public class RentalCar {

    private final Id id;

    private final long price;

    public RentalCar(Id id, long price) {
        this.id = id;
        this.price = price;
    }

    public long calculatePrice(int days) {
        return price * days;
    }

    @EqualsAndHashCode
    public static class Id {
        private final String id;

        public Id(String id) {
            this.id = id;
        }
    }
}
