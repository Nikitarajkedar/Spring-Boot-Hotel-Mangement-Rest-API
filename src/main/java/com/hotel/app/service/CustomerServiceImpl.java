package com.hotel.app.service;

import java.util.Optional;

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
public Customer CustomerFindByID(int id) {
	
	boolean flag = customerRepository.existsById(id);
	
	if(flag)
	{
		Customer customer = customerRepository.findById(id).get();
		
		return customer;
	}
	
	
	return null;
}

}
