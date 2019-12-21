package com.spring.reactive.DemoService.controller;

import com.spring.reactive.DemoService.Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ReservationService {
private ReservationRepository reservationRepository;

    @GetMapping(value="/getAll")
    public String getAllReservation(){
        return "Partha";
    }
}
