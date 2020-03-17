package com.hari.flight.service;

import com.hari.flight.exception.DBException;
import com.hari.flight.exception.UserNotFoundException;
import com.hari.flight.model.BookingInfo;

public interface BookingService {
	 BookingInfo flightBooking(BookingInfo bookingInfo) throws UserNotFoundException, DBException; 

}
