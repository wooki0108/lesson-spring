package com.lesson.spring.repository;

import com.lesson.spring.domain.Discount;
import com.lesson.spring.domain.Discount.Pair;
import com.lesson.spring.domain.RentalCar;
import com.lesson.spring.domain.RentalCar.Id;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class DiscountRepository {


    public Discount findDiscountCar(Id carId) {
        RentalCar.Id rentalCarId = new RentalCar.Id("aa123");

        List<Pair<Integer, Double>> pairs = List.of(
                new Pair(5, 5),
                new Pair(8, 10)
        );

        return new Discount(rentalCarId, pairs);
    }
}
