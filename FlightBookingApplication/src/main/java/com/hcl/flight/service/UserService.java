package com.hcl.flight.service;

import java.util.List;

import com.hcl.flight.exception.DBException;
import com.hcl.flight.exception.UserNotFoundException;
import com.hcl.flight.model.UserDetails;


public interface UserService {
	List<UserDetails> fetchUserDetails() throws UserNotFoundException ;
	UserDetails saveUserDetails(UserDetails UserDetails) throws DBException;
	UserDetails findById(Long id) throws UserNotFoundException;

}
