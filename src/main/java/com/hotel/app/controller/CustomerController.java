package com.hotel.app.controller;

<<<<<<< HEAD
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
=======
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

>>>>>>> 336108d810fbdb29f9055f327f3dde36c26ef128
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

	@PostMapping
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		
	Customer saveCusoomer	=customerService.saveCustomer(customer);
		
	return new ResponseEntity<Customer>(HttpStatus.CREATED);
		
	}
}
