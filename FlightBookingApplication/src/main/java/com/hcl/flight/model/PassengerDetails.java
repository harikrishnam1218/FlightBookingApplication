package com.hcl.flight.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="passenger")
public class PassengerDetails implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4255870371871004773L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pid;
	private String name;
	private String gender;
	private Integer age;	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="bid")
	private BookingInfo bookingInfo;

	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public BookingInfo getBookingInfo() {
		return bookingInfo;
	}
	public void setBookingInfo(BookingInfo bookingInfo) {
		this.bookingInfo = bookingInfo;
	}
	

	
}
