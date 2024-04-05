package com.lesson.spring.repository;

import com.lesson.spring.domain.RentalCar;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public class RentalCarRepository {

    private static final Map<RentalCar.Id,RentalCar> RENTALCARS;

    static {
        RentalCar.Id hundai01 = new RentalCar.Id("hundai01");
        RENTALCARS = Map.of(hundai01, new RentalCar(hundai01, 100_000L));
    }


    public Optional<RentalCar> findRentalCar(RentalCar.Id rentalCarId) {
        return Optional.ofNullable(RENTALCARS.get(rentalCarId));
    }

}
