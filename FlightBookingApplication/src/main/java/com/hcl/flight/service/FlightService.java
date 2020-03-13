package com.hcl.flight.service;

import java.util.Date;
import java.util.List;

import com.hcl.flight.exception.DBException;
import com.hcl.flight.model.BookingInfo;
import com.hcl.flight.model.FlightBook;

public interface FlightService {
	List<FlightBook> fetchFlightDetails(String source, String destination, Date availablity);

	FlightBook addFlightDetails(FlightBook flightBook) throws DBException;

	List<FlightBook> allFlights() throws DBException;
	
	//BookingInfo flightBooking(BookingInfo bookingInfo);
}
