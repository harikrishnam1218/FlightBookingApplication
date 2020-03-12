package com.hcl.flight.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class FlightBook {
private Long fid;
private String fname;
private String source;
private String destination;
private String seatno;
private Date availableDate;
private Double price;

	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name="bid") private BookingInfo bookingInfo;
	 */

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public Long getFid() {
	return fid;
}
public void setFid(Long fid) {
	this.fid = fid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getDestination() {
	return destination;
}
public void setDestination(String destination) {
	this.destination = destination;
}
public String getSeatno() {
	return seatno;
}
public void setSeatno(String seatno) {
	this.seatno = seatno;
}
public Date getAvailableDate() {
	return availableDate;
}
public void setAvailableDate(Date availableDate) {
	this.availableDate = availableDate;
}

public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

	/*
	 * public BookingInfo getBookingInfo() { return bookingInfo; } public void
	 * setBookingInfo(BookingInfo bookingInfo) { this.bookingInfo = bookingInfo; }
	 */
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((availableDate == null) ? 0 : availableDate.hashCode());
	result = prime * result + ((destination == null) ? 0 : destination.hashCode());
	result = prime * result + ((fid == null) ? 0 : fid.hashCode());
	result = prime * result + ((fname == null) ? 0 : fname.hashCode());
	result = prime * result + ((seatno == null) ? 0 : seatno.hashCode());
	result = prime * result + ((source == null) ? 0 : source.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	FlightBook other = (FlightBook) obj;
	if (availableDate == null) {
		if (other.availableDate != null)
			return false;
	} else if (!availableDate.equals(other.availableDate))
		return false;
	if (destination == null) {
		if (other.destination != null)
			return false;
	} else if (!destination.equals(other.destination))
		return false;
	if (fid == null) {
		if (other.fid != null)
			return false;
	} else if (!fid.equals(other.fid))
		return false;
	if (fname == null) {
		if (other.fname != null)
			return false;
	} else if (!fname.equals(other.fname))
		return false;
	if (seatno == null) {
		if (other.seatno != null)
			return false;
	} else if (!seatno.equals(other.seatno))
		return false;
	if (source == null) {
		if (other.source != null)
			return false;
	} else if (!source.equals(other.source))
		return false;
	return true;
}
@Override
public String toString() {
	return "Flight [fid=" + fid + ", fname=" + fname + ", source=" + source + ", destination=" + destination
			+ ", seatno=" + seatno + ", availableDate=" + availableDate + "]";
}


}
