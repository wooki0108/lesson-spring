package com.lesson.spring.service;

import com.lesson.spring.domain.Discount;
import com.lesson.spring.domain.RentalCar;
import com.lesson.spring.domain.RentalCar.Id;
import com.lesson.spring.repository.DiscountRepository;
import com.lesson.spring.repository.RentalCarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalCarService {

    private final RentalCarRepository rentalCarRepository;
    private final DiscountRepository discountRepository;

    public long calculatePrice(String requestCarId, int days) {
        RentalCar.Id carId = new RentalCar.Id(requestCarId);
        RentalCar rentalCar = rentalCarRepository.findRentalCar(carId)
                .orElseThrow();
        return rentalCar.calculatePrice(days);
    }

    public long calculateDiscountPrice(String requestCarId, int days) {
        RentalCar.Id carId = new RentalCar.Id(requestCarId);
        RentalCar rentalCar = rentalCarRepository.findRentalCar(carId)
                .orElseThrow();

        Discount discount = discountRepository.findDiscountCar(carId);
        discount.calculatePrice(days);

        return rentalCar.calculateDiscountPrice(days);
    }
}
