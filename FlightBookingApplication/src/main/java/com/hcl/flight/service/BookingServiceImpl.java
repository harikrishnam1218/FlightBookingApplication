package com.hcl.flight.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.flight.exception.DBException;
import com.hcl.flight.exception.UserNotFoundException;
import com.hcl.flight.model.BookingInfo;
import com.hcl.flight.model.PassengerDetails;
import com.hcl.flight.model.UserDetails;
import com.hcl.flight.repository.BookingRepository;
import com.hcl.flight.repository.PassengerRepository;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	private UserService  userService;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private PassengerRepository passengerRepository;
	

	
	  @Override 
	public BookingInfo flightBooking(BookingInfo bookingInfo) throws UserNotFoundException,DBException {
		  List<PassengerDetails> pass=new ArrayList<PassengerDetails>();
		UserDetails user = bookingInfo.getUserDetails();
		if (user == null) {
			throw new UserNotFoundException("USER MUST LOGIN THE PAGE");
		}
		UserDetails user1 = userService.findById(user.getUid());
		if (user1 == null) {
			throw new UserNotFoundException("UserName Not Found Exception");
		}
		//bookingInfo.setUserDetails(user1);
		List<PassengerDetails>	passengers=bookingInfo.getPassengerDetails();
		BookingInfo info = bookingRepository.save(bookingInfo);
		  if(info==null) {
			  throw new DBException("booking info was not saved in DB");
		  }
		/*
		 * for (PassengerDetails pas : passengers) { PassengerDetails pas1=new
		 * PassengerDetails(); pas1.setAge(pas.getAge());
		 * pas1.setGender(pas.getGender()); pas1.setName(pas.getGender());
		 * pas1.setBookingInfo(info); pass.add(pas1); }
		 * bookingInfo.setPassengerDetails(pass); passengerRepository.saveAll(pass);
		 */
	//	BookingInfo info = bookingRepository.save(bookingInfo);
		
		return info;
	}
	 
}
