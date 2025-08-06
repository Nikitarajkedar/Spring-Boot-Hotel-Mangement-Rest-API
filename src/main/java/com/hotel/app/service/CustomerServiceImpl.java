package com.hotel.app.service;

<<<<<<< HEAD
import java.util.Optional;
=======
import java.util.List;
>>>>>>> 336108d810fbdb29f9055f327f3dde36c26ef128

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
<<<<<<< HEAD
public Customer CustomerFindByID(int id) {
	
	boolean flag = customerRepository.existsById(id);
	
	if(flag)
	{
		Customer customer = customerRepository.findById(id).get();
		
		return customer;
	}
	
	
	return null;
}

=======
public Customer saveCustomer(Customer customer) {
	Customer save = customerRepository.save(customer);
	return save;
>>>>>>> 336108d810fbdb29f9055f327f3dde36c26ef128
}


}


