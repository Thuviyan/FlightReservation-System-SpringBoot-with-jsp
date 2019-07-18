package com.sgic.flightreservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sgic.flightreservation.dto.ReservationRequest;
import com.sgic.flightreservation.entities.Flight;
import com.sgic.flightreservation.entities.Passenger;
import com.sgic.flightreservation.entities.Reservation;
import com.sgic.flightreservation.repos.FlightRepository;
import com.sgic.flightreservation.repos.PassengerRepository;
import com.sgic.flightreservation.repos.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	FlightRepository flightRepository;
	
	@Autowired
	PassengerRepository passengerRepository;
	
	@Autowired
	ReservationRepository reservationRepository;
	
	
	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		//Make Payment
		
		Long flightId = request.getFlightId();
		System.out.println(flightId);
		Flight flight = flightRepository.findFlightById(flightId);
		
		
		Passenger passenger = new Passenger();
		passenger.setFirstName(request.getPassengerFirstName());
		passenger.setLastName(request.getPassengerLastName());
		passenger.setPhone(request.getPassengerPhone());
		passenger.setEmail(request.getPassengerEmail());
		
		Passenger savedPassenger = passengerRepository.save(passenger);
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(savedPassenger);
		reservation.setCheckedIn(false);
		
		Reservation savedReservation = reservationRepository.save(reservation);
		
		return savedReservation;
	}

}
