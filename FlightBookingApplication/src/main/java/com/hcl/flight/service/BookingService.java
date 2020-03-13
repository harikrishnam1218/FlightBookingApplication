package com.hcl.flight.service;

import com.hcl.flight.exception.DBException;
import com.hcl.flight.exception.UserNotFoundException;
import com.hcl.flight.model.BookingInfo;

public interface BookingService {
	 BookingInfo flightBooking(BookingInfo bookingInfo) throws UserNotFoundException, DBException; 

}
