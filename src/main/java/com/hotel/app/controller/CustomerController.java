package com.hotel.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.model.Customer;
import com.hotel.app.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@PostMapping
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		
	Customer saveCusoomer	=customerService.saveCustomer(customer);
		
	return new ResponseEntity<Customer>(HttpStatus.CREATED);
		
	}
}
