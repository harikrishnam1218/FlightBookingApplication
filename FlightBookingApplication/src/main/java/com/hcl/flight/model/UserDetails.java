package com.hcl.flight.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="userdetail")
public class UserDetails {

	private Long id;
	private String name;
	private String role;
	private Integer age;
	private String sex;
	private String mealPreference;
	private String email;	
	//private List<BookingInfo> bookingInfos;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="bid")
	private BookingInfo bookingInfos;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public String getMealPreference() {
		return mealPreference;
	}
	public void setMealPreference(String mealPreference) {
		this.mealPreference = mealPreference;
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
	
	
	public BookingInfo getBookingInfos() {
		return bookingInfos;
	}
	public void setBookingInfos(BookingInfo bookingInfos) {
		this.bookingInfos = bookingInfos;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((bookingInfos == null) ? 0 : bookingInfos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mealPreference == null) ? 0 : mealPreference.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
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
		if (bookingInfos == null) {
			if (other.bookingInfos != null)
				return false;
		} else if (!bookingInfos.equals(other.bookingInfos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mealPreference == null) {
			if (other.mealPreference != null)
				return false;
		} else if (!mealPreference.equals(other.mealPreference))
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
		return true;
	}
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", role=" + role + ", age=" + age + ", sex=" + sex
				+ ", mealPreference=" + mealPreference + ", bookingInfos=" + bookingInfos + "]";
	}
	
	
}
