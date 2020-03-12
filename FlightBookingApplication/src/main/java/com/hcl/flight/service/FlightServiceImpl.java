package com.hcl.flight.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.flight.model.FlightBook;
import com.hcl.flight.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	private FlightRepository flightRepository;
	
	@Override
	public List<FlightBook> fetchFlightDetails(String source, String destnation, Date availablity) {
		List<FlightBook> avalilableFlights=flightRepository.getBySourceAndDestnation(source, destnation, availablity);
		if(avalilableFlights==null ||avalilableFlights.isEmpty()) {
			throw new RuntimeException("No Available Flights Between Stations");
		}
		return avalilableFlights;
	}

}
