package com.hcl.flight.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.flight.model.FlightBook;

@Repository
public interface FlightRepository extends JpaRepository<FlightBook, Long>{
	@Query(value="select fb from Flightbook as fb where fb.source=?1 and fb.destination=?2 and fb.availableDate=?3 ")
	List<FlightBook> getBySourceAndDestnation(String source,String destnation,Date available);

}

