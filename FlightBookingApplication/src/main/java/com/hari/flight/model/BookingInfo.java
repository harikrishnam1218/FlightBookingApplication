package com.hari.flight.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bookinginfo")
public class BookingInfo implements Serializable{

	private static final long serialVersionUID = -9217099875498024799L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fid")
	private FlightBook flight;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uid")
	private UserDetails userDetails;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bookingInfo",cascade = CascadeType.ALL)
	private List<PassengerDetails> passengerDetails=new ArrayList<PassengerDetails>();

	public List<PassengerDetails> getPassengerDetails() {
		return passengerDetails;
	}

	public void setPassengerDetails(List<PassengerDetails> passengerDetails) {
		this.passengerDetails = passengerDetails;
	}

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

}
