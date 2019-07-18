package com.sgic.flightreservation.service;

import com.sgic.flightreservation.dto.ReservationRequest;
import com.sgic.flightreservation.entities.Reservation;

public interface ReservationService {
	
	public Reservation bookFlight(ReservationRequest request);

}
