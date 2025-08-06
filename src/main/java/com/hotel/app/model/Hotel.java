package com.hotel.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Hotel_Details")
public class Hotel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer hotelId;
	
	private String hotelName;
	
	private String hotelLocation;
	
	private Double hotelRating;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Customer> customer;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(Integer hotelId, String hotelName, String hotelLocation, Double hotelRating, List<Customer> customer) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.hotelLocation = hotelLocation;
		this.hotelRating = hotelRating;
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelLocation=" + hotelLocation
				+ ", hotelRating=" + hotelRating + ", customer=" + customer + "]";
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelLocation() {
		return hotelLocation;
	}

	public void setHotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}

	public Double getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(Double hotelRating) {
		this.hotelRating = hotelRating;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	
}
