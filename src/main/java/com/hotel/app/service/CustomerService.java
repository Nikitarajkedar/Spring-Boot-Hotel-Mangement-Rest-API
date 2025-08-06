package com.hotel.app.service;

import java.util.List;

import com.hotel.app.model.Customer;

public interface CustomerService {


	List<Customer> getCutomerDataByPage(Integer pageNumber, Integer size);

	Customer saveCustomer(Customer customer);


	
}
