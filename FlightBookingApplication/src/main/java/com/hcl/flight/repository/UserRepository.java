package com.hcl.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.flight.model.UserDetails;
@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {

}
