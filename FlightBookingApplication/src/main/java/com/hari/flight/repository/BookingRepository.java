package com.hari.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hari.flight.model.BookingInfo;

public interface BookingRepository extends JpaRepository<BookingInfo, Long>  {

}
