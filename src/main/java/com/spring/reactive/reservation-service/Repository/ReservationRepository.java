package com.spring.reactive.DemoService.Repository;

import com.spring.reactive.DemoService.Model.Reservation;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends ReactiveCrudRepository<Reservation,String> {
}
