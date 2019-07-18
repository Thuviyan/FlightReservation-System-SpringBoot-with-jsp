package com.sgic.flightreservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages= {"com.sgic.flightreservation.controllers"})
public class FlightreservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightreservationApplication.class, args);
	}

}
