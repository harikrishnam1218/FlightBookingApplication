package com.hcl.flight.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hcl.flight.model.FlightBook;

@Repository
public interface FlightRepository extends JpaRepository<FlightBook, Long>{
	@Query("from FlightBook fb where fb.source=:source and fb.destination=:destination and fb.availabledate=:available ")
	List<FlightBook> getBySourceAndDestnation(String source,String destnation,Date available);

}

