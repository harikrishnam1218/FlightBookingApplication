package com.hari.flight.service;

import java.util.List;

import com.hari.flight.exception.DBException;
import com.hari.flight.exception.UserNotFoundException;
import com.hari.flight.model.UserDetails;


public interface UserService {
	List<UserDetails> fetchUserDetails() throws UserNotFoundException ;
	UserDetails saveUserDetails(UserDetails UserDetails) throws DBException;
	UserDetails findById(Long id) throws UserNotFoundException;

}
