package com.lesson.spring.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import com.lesson.spring.domain.Discount.Pair;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DiscountTest {

    @DisplayName("할인가격을 구한다.")
    @Test
    void test(){
        RentalCar.Id rentalCarId = new RentalCar.Id("aa12");

        List<Pair<Integer, Double>> pairs = List.of(
                new Pair(5, 5),
                new Pair(8, 10)
        );

        //given 테스트를 위한 모든 준비 단계
        Discount discount = new Discount(rentalCarId, pairs);

        //when 행위만

        long result0 = discount.calculatePrice(3);
        long result1 = discount.calculatePrice(5);
        long result2 = discount.calculatePrice(10);


        //then 행위에 대한 결과
        assertThat(result0).isEqualTo(1000);
        assertThat(result1).isEqualTo(0);
        assertThat(result2).isEqualTo(0);



    }

}