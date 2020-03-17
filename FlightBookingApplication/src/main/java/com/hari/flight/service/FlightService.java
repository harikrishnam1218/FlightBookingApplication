package com.hari.flight.service;

import java.util.Date;
import java.util.List;

import com.hari.flight.exception.DBException;
import com.hari.flight.model.BookingInfo;
import com.hari.flight.model.FlightBook;

public interface FlightService {
	List<FlightBook> fetchFlightDetails(String source, String destination, Date availablity);

	FlightBook addFlightDetails(FlightBook flightBook) throws DBException;

	List<FlightBook> allFlights() throws DBException;
	
	//BookingInfo flightBooking(BookingInfo bookingInfo);
}
