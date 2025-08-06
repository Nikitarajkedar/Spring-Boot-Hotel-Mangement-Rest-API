package com.hotel.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.model.Customer;
import com.hotel.app.service.CustomerService;

@RestController
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping(value="/customers/{id}")
	public ResponseEntity<Customer> CustomerFindById(@PathVariable int id )
	{
		Customer customer=customerService.CustomerFindByID(id);
		
		if(customer!=null)
		{
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		}
		
		return new ResponseEntity<Customer>(customer, HttpStatus.NO_CONTENT);
	}

}
