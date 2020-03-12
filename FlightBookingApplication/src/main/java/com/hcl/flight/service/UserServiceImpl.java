package com.hcl.flight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.flight.exception.DBException;
import com.hcl.flight.exception.UserNotFoundException;
import com.hcl.flight.model.UserDetails;
import com.hcl.flight.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserDetails> fetchUserDetails() throws UserNotFoundException {
	List<UserDetails> list=	userRepository.findAll();
	if(list==null||list.isEmpty()) {
		throw new UserNotFoundException("UserDetails Records Not Found From DB");
	}
		return list;
	}

	@Override
	public UserDetails saveUserDetails(UserDetails UserDetails) throws DBException {
		UserDetails emp=userRepository.save(UserDetails);
		if(emp==null) {
			throw new DBException("UserDetails Data not saved Succesfulluy");
		}
		return emp;
	}

	@Override
	public UserDetails findById(Long id) throws UserNotFoundException {
		Optional<UserDetails>  ee=userRepository.findById(id);
		if(!ee.isPresent()) {
			throw new UserNotFoundException("User Details not found From Db ");
		}
		return ee.get();
	}
}
