package com.hotel.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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
public List<Customer> getCutomerDataByPage(Integer pageNumber, Integer size) {

PageRequest pageRequest= PageRequest.of(pageNumber, size);

Page<Customer> page = customerRepository.findAll(pageRequest);

List<Customer> dbproducts = page.getContent();

return dbproducts;
}

}
