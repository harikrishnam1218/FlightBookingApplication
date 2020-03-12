package com.hcl.flight.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.flight.exception.DBException;
import com.hcl.flight.exception.UserNotFoundException;
import com.hcl.flight.model.FlightBook;
import com.hcl.flight.model.UserDetails;
import com.hcl.flight.service.FlightService;
import com.hcl.flight.service.UserService;


@RestController
public class FlightBookController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private FlightService flightService;
	
	@GetMapping(value="/userlist")
	public ResponseEntity<List<UserDetails>> fetchUserDetails() throws UserNotFoundException {
		List<UserDetails> list=userService.fetchUserDetails();
		return new ResponseEntity(list, HttpStatus.OK);
	}
	@PostMapping(value="/save")
	public ResponseEntity saveUserDetails(@Valid UserDetails UserDetails) throws DBException{
		return new ResponseEntity(userService.saveUserDetails(UserDetails),HttpStatus.OK);
	}
	
	@GetMapping(value="/user/id")
	public ResponseEntity<UserDetails> fetchUser(@PathVariable("id") Long id) throws UserNotFoundException {
		UserDetails list=userService.findById(id);
		return new ResponseEntity(list, HttpStatus.OK);
	}
	@GetMapping(value="/searchflights")
	public ResponseEntity<List<FlightBook>> fetchFlights(@RequestParam("source") String source,@RequestParam("destnation") String destnation,@RequestParam("availablity") Date availablity) {
		List<FlightBook> list=flightService.fetchFlightDetails(source, destnation, availablity);
		return new ResponseEntity(list, HttpStatus.OK);
	}
	/*
	 * @PostMapping(value="/bookflight") public ResponseEntity
	 * saveUserDetails(@Valid UserDetails UserDetails) throws DBException{ return
	 * new ResponseEntity(userService.saveUserDetails(UserDetails),HttpStatus.OK); }
	 */
	
}
