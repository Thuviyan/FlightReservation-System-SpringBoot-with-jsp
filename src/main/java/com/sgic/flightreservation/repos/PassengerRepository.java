package com.sgic.flightreservation.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sgic.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
