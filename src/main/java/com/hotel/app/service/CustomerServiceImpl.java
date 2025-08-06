package com.hotel.app.service;

import org.springframework.stereotype.Service;

import com.hotel.app.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	
private CustomerRepository customerRepository;

public CustomerServiceImpl(CustomerRepository customerRepository) {
	super();
	this.customerRepository = customerRepository;
}

}
