package com.hcl.flight.service;

import java.util.Date;
import java.util.List;

import com.hcl.flight.model.FlightBook;

public interface FlightService {
List<FlightBook> fetchFlightDetails(String source,String destnation,Date availablity);
}
