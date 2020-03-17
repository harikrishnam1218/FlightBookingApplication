package com.hari.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hari.flight.model.UserDetails;
@Repository
public interface UserRepository extends JpaRepository<UserDetails, Long> {

}
