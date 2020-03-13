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
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((mealpreference == null) ? 0 : mealpreference.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
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
		UserDetails other = (UserDetails) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mealpreference == null) {
			if (other.mealpreference != null)
				return false;
		} else if (!mealpreference.equals(other.mealpreference))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UserDetails [uid=" + uid + ", name=" + name + ", role=" + role + ", age=" + age + ", sex=" + sex
				+ ", mealPreference=" + mealpreference + ", email=" + email + "]";
	}
	
	
	/*public BookingInfo getBookingInfos() {
		return bookingInfos;
	}
	public void setBookingInfos(BookingInfo bookingInfos) {
		this.bookingInfos = bookingInfos;
	}*/
	
}
