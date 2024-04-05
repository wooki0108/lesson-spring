package com.lesson.spring.domain;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class RentalCarTest {

    @Test
    void calculatePrice() {
        //given
        RentalCar.Id id = new RentalCar.Id("test01");
        RentalCar rentalCar = new RentalCar(id, 150_000L);
        int days = 3;

        //when
        long price = rentalCar.calculatePrice(days);

        //then
        assertEquals(450_000L, price);
    }

}