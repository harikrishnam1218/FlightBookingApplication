package com.hcl.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.flight.model.PassengerDetails;

public interface PassengerRepository extends JpaRepository<PassengerDetails, Long>{

}
