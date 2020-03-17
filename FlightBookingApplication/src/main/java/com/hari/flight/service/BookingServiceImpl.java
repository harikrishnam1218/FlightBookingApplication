package com.hari.flight.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hari.flight.exception.DBException;
import com.hari.flight.exception.UserNotFoundException;
import com.hari.flight.model.BookingInfo;
import com.hari.flight.model.PassengerDetails;
import com.hari.flight.model.UserDetails;
import com.hari.flight.repository.BookingRepository;

@Service
@Transactional
public class BookingServiceImpl implements BookingService{

	@Autowired
	private UserService  userService;
	
	@Autowired
	private BookingRepository bookingRepository;
	
	  @Override 
	public BookingInfo flightBooking(BookingInfo bookingInfo) throws UserNotFoundException,DBException {
		 // List<PassengerDetails> pass=new ArrayList<PassengerDetails>();
		UserDetails user = bookingInfo.getUserDetails();
		if (Objects.isNull(user)) {
			throw new UserNotFoundException("USER MUST LOGIN THE PAGE");
		}
		UserDetails user1 = userService.findById(user.getUid());
		if (Objects.isNull(user1)) {
			throw new UserNotFoundException("UserName Not Found Exception");
		}
		//bookingInfo.setUserDetails(user1);
		
		  List<PassengerDetails> passengers=bookingInfo.getPassengerDetails(); 
		  for(PassengerDetails passengerDetails : passengers) {
		  passengerDetails.setBookingInfo(bookingInfo); }
		  bookingInfo.setPassengerDetails(passengers);
		 
		BookingInfo info = bookingRepository.save(bookingInfo);
		  if(Objects.isNull(info)) {
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
