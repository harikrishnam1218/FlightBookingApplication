package com.hcl.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hcl.flight.model.BookingInfo;

@Repository
public interface BookingRepository extends JpaRepository<BookingInfo, Long> {

}
