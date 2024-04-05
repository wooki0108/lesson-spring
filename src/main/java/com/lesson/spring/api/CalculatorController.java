package com.lesson.spring.api;

import com.lesson.spring.service.RentalCarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalculatorController {

    private final RentalCarService rentalCarService;

    @GetMapping("/api/v1/rental-car/{carId}/price")
    public long calculateFeeApi(@PathVariable String carId, int days) {
        return rentalCarService.calculatePrice(carId, days);
    }

}
