package com.hcl.flight.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="bookinginfo")
public class BookingInfo {
	
private Long bid;

//@OneToOne(mappedBy = "bookingInfo",cascade =CascadeType.ALL)
@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "fid", nullable = false)
private FlightBook flight;
//@OneToOne(mappedBy = "bookingInfos",cascade =CascadeType.ALL)
@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "uid", nullable = false)
private UserDetails userDetails;

//@OneToMany(fetch = FetchType.LAZY,mappedBy = "bookingInfo",cascade =CascadeType.ALL)
@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "pid", nullable = false)
private PassengerDetails passengerDetails;


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
public PassengerDetails getPassengerDetails() {
	return passengerDetails;
}
public void setPassengerDetails(PassengerDetails passengerDetails) {
	this.passengerDetails = passengerDetails;
}


}
