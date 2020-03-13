package com.hcl.flight.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="userdetail")
public class UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long uid;
	private String name;
	private String role;
	private Integer age;
	private String sex;
	private String mealpreference;
	private String email;	
	//private List<BookingInfo> bookingInfos;
	/*@OneToOne(fetch = mealpreferenceFetchType.LAZY)
	@JoinColumn(name="bid")
	private BookingInfo bookingInfos;
	*/
	
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getMealpreference() {
		return mealpreference;
	}
	public void setMealpreference(String mealpreference) {
		this.mealpreference = mealpreference;
	}
	/*
	 * public List<BookingInfo> getBookingInfos() { return bookingInfos; } public
	 * void setBookingInfos(List<BookingInfo> bookingInfos) { this.bookingInfos =
	 * bookingInfos; }
	 */

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	/*public BookingInfo getBookingInfos() {
		return bookingInfos;
	}
	public void setBookingInfos(BookingInfo bookingInfos) {
		this.bookingInfos = bookingInfos;
	}*/
	
}
