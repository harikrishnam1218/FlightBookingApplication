package com.hcl.flight.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookinginfo")
public class BookingInfo {
	
private Long bid;

@OneToOne(mappedBy = "bookingInfo",cascade =CascadeType.ALL)
private FlightBook flight;
@OneToOne(mappedBy = "bookingInfos",cascade =CascadeType.ALL)
private UserDetails userDetails;

@OneToMany(fetch = FetchType.LAZY,mappedBy = "bookingInfo",cascade =CascadeType.ALL)
private List<PassengerDetails> passengerDetails;


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long getBid() {
	return bid;
}
public void setBid(Long bid) {
	this.bid = bid;
}


public FlightBook getFlight() {
	return flight;
}

public void setFlight(FlightBook flight) {
	this.flight = flight;
}
public UserDetails getUserDetails() {
	return userDetails;
}
public void setUserDetails(UserDetails userDetails) {
	this.userDetails = userDetails;
}
public List<PassengerDetails> getPassengerDetails() {
	return passengerDetails;
}
public void setPassengerDetails(List<PassengerDetails> passengerDetails) {
	this.passengerDetails = passengerDetails;
}


}
