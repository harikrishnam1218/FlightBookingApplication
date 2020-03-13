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
private int  availableseats;
private Date availabledate;
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


public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getAvailableseats() {
	return availableseats;
}
public void setAvailableseats(int availableseats) {
	this.availableseats = availableseats;
}
public Date getAvailabledate() {
	return availabledate;
}
public void setAvailabledate(Date availabledate) {
	this.availabledate = availabledate;
}
public FlightBook(Long fid, String fname, String source, String destination, int availableseats, Date availabledate,
		Double price) {
	super();
	this.fname = fname;
	this.source = source;
	this.destination = destination;
	this.availableseats = availableseats;
	this.availabledate = availabledate;
	this.price = price;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((availabledate == null) ? 0 : availabledate.hashCode());
	result = prime * result + availableseats;
	result = prime * result + ((destination == null) ? 0 : destination.hashCode());
	result = prime * result + ((fid == null) ? 0 : fid.hashCode());
	result = prime * result + ((fname == null) ? 0 : fname.hashCode());
	result = prime * result + ((price == null) ? 0 : price.hashCode());
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
	if (availabledate == null) {
		if (other.availabledate != null)
			return false;
	} else if (!availabledate.equals(other.availabledate))
		return false;
	if (availableseats != other.availableseats)
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
	if (price == null) {
		if (other.price != null)
			return false;
	} else if (!price.equals(other.price))
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
	return "FlightBook [fid=" + fid + ", fname=" + fname + ", source=" + source + ", destination=" + destination
			+ ", availableseats=" + availableseats + ", availabledate=" + availabledate + ", price=" + price + "]";
}
public FlightBook() {
	super();
}



	/*
	 * public BookingInfo getBookingInfo() { return bookingInfo; } public void
	 * setBookingInfo(BookingInfo bookingInfo) { this.bookingInfo = bookingInfo; }
	 */


}
