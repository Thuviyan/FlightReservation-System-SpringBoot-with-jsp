package com.sgic.flightreservation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sgic.flightreservation.dto.ReservationUpdateRequest;
import com.sgic.flightreservation.entities.Reservation;
import com.sgic.flightreservation.repos.ReservationRepository;

@RestController
public class ReservationRestController {
	
	@Autowired
	ReservationRepository reservationRepository;
	
	@RequestMapping("/reservations/{id}")
	public Reservation findReservation(@PathVariable("id") Long id) {
		return reservationRepository.findReservationById(id);
	}
	
	@RequestMapping("/reservations")
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
		Reservation reservation = reservationRepository.findReservationById(request.getId());
		reservation.setNumberOfBags(request.getNumberOfBags());
		reservation.setCheckedIn(request.getCheckedIn());
		Reservation updatedReservation = reservationRepository.save(reservation);
		return updatedReservation;
		
	}

}
