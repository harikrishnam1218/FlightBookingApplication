package com.hcl.flight.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.flight.exception.DBException;
import com.hcl.flight.exception.UserNotFoundException;
import com.hcl.flight.model.BookingInfo;
import com.hcl.flight.model.FlightBook;
import com.hcl.flight.model.UserDetails;
import com.hcl.flight.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	private FlightRepository flightRepository;
	
	@Override
	public List<FlightBook> fetchFlightDetails(String source, String destination, Date availablity) {
		List<FlightBook> avalilableFlights=flightRepository.getBySourceAndDestnation(source, destination);
		if(avalilableFlights==null ||avalilableFlights.isEmpty()) {
			throw new RuntimeException("No Available Flights Between Stations");
		}
		return avalilableFlights;
	}


	@Override
	public FlightBook addFlightDetails(FlightBook flightBook) throws DBException {
		if(flightBook!=null) {
			String source=flightBook.getSource();
			String destination=flightBook.getDestination();
			if(source!=null && destination!=null) {
				flightBook.setSource(source.toLowerCase());
				flightBook.setDestination(destination.toLowerCase());
			}
		}
		FlightBook flight=flightRepository.save(flightBook);
		if(flight==null) {
			throw new DBException("Flight Details Data not saved Succesfulluy");
		}
		return flight;
	}


	@Override
	public List<FlightBook> allFlights() throws DBException {
		List<FlightBook> list=flightRepository.findAll();
		if(list==null || list.isEmpty()) {
			throw new DBException("No Flights From Flights table");
		}
		return flightRepository.findAll();
	}

	/*
	 * @Override public BookingInfo flightBooking(BookingInfo bookingInfo) { // TODO
	 * Auto-generated method stub return null; }
	 */

}
