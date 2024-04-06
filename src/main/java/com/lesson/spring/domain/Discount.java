package com.lesson.spring.domain;

import com.lesson.spring.domain.RentalCar.Id;
import java.util.List;
import lombok.Getter;

@Getter
public class Discount {

    private RentalCar.Id rentalcarId;

    // 기간, 할인
    private final List<Pair<Integer, Double>> priceByDays;

    public Discount(Id rentalCarId, List<Pair<Integer, Double>> priceByDays) {
        this.rentalcarId = rentalCarId;
        this.priceByDays = priceByDays;
    }

    public long calculatePrice(int days) {
        for (Pair<Integer, Double> priceByDay : priceByDays) {

            // priceByDay.left = 빌리는 기간
            if (priceByDay.left < days) {

            }

        }
        return 0;
    }

    public static class Pair<L,R>{
        L left;
        R right;
        public Pair(L x, R y){
            this.left=x;
            this.right=y;
        }
    }
}
