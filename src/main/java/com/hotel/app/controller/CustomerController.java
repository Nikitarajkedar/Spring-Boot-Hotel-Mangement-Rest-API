package com.hotel.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.service.CustomerService;

@RestController
public class CustomerController {
	
	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

}
