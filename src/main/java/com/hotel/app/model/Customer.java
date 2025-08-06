package com.hotel.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_Details")
public class Customer {
 
	@Id
	private Integer customerId;
	
	private String customerName;
	
	private Long mobailNumber;
	
	private String adharCardNumber;
	
	
	@ManyToOne
	@JoinColumn(name = "hotel_Id")
	private Hotel hotel;


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Customer(Integer customerId, String customerName, Long mobailNumber, String adharCardNumber, Hotel hotel) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobailNumber = mobailNumber;
		this.adharCardNumber = adharCardNumber;
		this.hotel = hotel;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobailNumber="
				+ mobailNumber + ", adharCardNumber=" + adharCardNumber + ", hotel=" + hotel + "]";
	}


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Long getMobailNumber() {
		return mobailNumber;
	}


	public void setMobailNumber(Long mobailNumber) {
		this.mobailNumber = mobailNumber;
	}


	public String getAdharCardNumber() {
		return adharCardNumber;
	}


	public void setAdharCardNumber(String adharCardNumber) {
		this.adharCardNumber = adharCardNumber;
	}


	public Hotel getHotel() {
		return hotel;
	}


	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	
	
	
}
