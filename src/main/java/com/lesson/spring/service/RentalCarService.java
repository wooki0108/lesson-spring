package com.lesson.spring.service;

import com.lesson.spring.domain.RentalCar;
import com.lesson.spring.repository.RentalCarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RentalCarService {

    private final RentalCarRepository rentalCarRepository;

    public long calculatePrice(String requestCarId, int days) {
        RentalCar.Id carId = new RentalCar.Id(requestCarId);
        RentalCar rentalCar = rentalCarRepository.findRentalCar(carId)
                .orElseThrow();
        return rentalCar.calculatePrice(days);
    }
}
