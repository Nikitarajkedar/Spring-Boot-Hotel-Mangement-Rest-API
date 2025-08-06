package com.hotel.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.hotel.app.model.Customer;
import com.hotel.app.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	
private CustomerRepository customerRepository;

public CustomerServiceImpl(CustomerRepository customerRepository) {
	super();
	this.customerRepository = customerRepository;
}

@Override
public Customer saveCustomer(Customer customer) {
	Customer save = customerRepository.save(customer);
	return save;
}


}


