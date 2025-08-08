package com.hotel.app.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.hotel.app.model.Customer;
import com.hotel.app.service.CustomerService;

@RestController
@RequestMapping(value = "/api")
public class CustomerController {

	private CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@GetMapping(value="/customers/{id}")
	public ResponseEntity<Customer> CustomerFindById(@PathVariable Integer id )
	{
		Customer dbcustomer=customerService.CustomerFindByID(id);
		
		if(dbcustomer!=null)
		{
			return new ResponseEntity<Customer>(dbcustomer, HttpStatus.OK);
		}
		
		return new ResponseEntity<Customer>(dbcustomer, HttpStatus.NO_CONTENT);
	}

	// GET all the products-By-Page
	// URL - http://localhost:9090/api/customer?page=2

	@GetMapping(value = "/customers")
	public ResponseEntity<List<Customer>> getCustomerDataByPage(
		@RequestParam(defaultValue = "0") Integer pageNumber,
		@RequestParam(defaultValue = "2") Integer size) {

		List<Customer> pageCustomer = customerService.getCustomerDataByPage(pageNumber, size);
		
		System.out.println("get customer By page");
		
		return new ResponseEntity<List<Customer>>(pageCustomer, HttpStatus.OK);

	}

	@PostMapping(value = "/customers")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
		
	Customer saveCustomer = customerService.saveCustomer(customer);
		
	return new ResponseEntity<Customer>(saveCustomer,HttpStatus.CREATED);
		
	}
	
	@PutMapping(value = "/customers/{id}")
	public ResponseEntity<Customer> updateById(@PathVariable Integer id,@RequestBody Customer customer){
	Customer updateCustomer = customerService.updatById(id,customer); 
		
	if(updateCustomer!= null) {
		
		return new ResponseEntity<Customer>(updateCustomer,HttpStatus.OK);
	}
	return new ResponseEntity<Customer>(updateCustomer,HttpStatus.NO_CONTENT);
	}
}
