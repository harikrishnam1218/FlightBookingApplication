package com.hcl.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hcl.flight.model.BookingInfo;

public interface BookingRepository extends JpaRepository<BookingInfo, Long>  {

}
