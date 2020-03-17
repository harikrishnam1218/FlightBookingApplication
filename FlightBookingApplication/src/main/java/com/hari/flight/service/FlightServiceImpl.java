package com.hari.flight.service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hari.flight.exception.DBException;
import com.hari.flight.exception.UserNotFoundException;
import com.hari.flight.model.BookingInfo;
import com.hari.flight.model.FlightBook;
import com.hari.flight.model.UserDetails;
import com.hari.flight.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService{

	@Autowired
	private FlightRepository flightRepository;
	
	@Override
	public List<FlightBook> fetchFlightDetails(String source, String destination, Date availablity) {
		List<FlightBook> avalilableFlights=flightRepository.findBySourceAndDestination(source, destination);
		if(Objects.isNull(avalilableFlights)||avalilableFlights.isEmpty()) {
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
		if(Objects.isNull(flight)) {
			throw new DBException("Flight Details Data not saved Succesfulluy");
		}
		return flight;
	}


	@Override
	public List<FlightBook> allFlights() throws DBException {
		List<FlightBook> list=flightRepository.findAll();
		if(Objects.isNull(list) || list.isEmpty()) {
			throw new DBException("No Flights From Flights table");
		}
		return flightRepository.findAll();
	}

	/*
	 * @Override public BookingInfo flightBooking(BookingInfo bookingInfo) { // TODO
	 * Auto-generated method stub return null; }
	 */

}
