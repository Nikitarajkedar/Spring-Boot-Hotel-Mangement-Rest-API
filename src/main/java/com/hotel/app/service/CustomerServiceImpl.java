package com.hotel.app.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.hotel.app.model.Customer;
import com.hotel.app.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}



	public List<Customer> getCutomerDataByPage(Integer pageNumber, Integer size) {

		PageRequest pageRequest = PageRequest.of(pageNumber, size);

		Page<Customer> page = customerRepository.findAll(pageRequest);

		List<Customer> dbproducts = page.getContent();

		return dbproducts;
	}

	public Customer saveCustomer(Customer customer) {

		Customer save = customerRepository.save(customer);

		return save;
	}

	@Override
	public Customer updatById(Integer id, Customer customer) {

		if (customerRepository.existsById(id)) {

			customer.setCustomerId(id);

			return customerRepository.save(customer);

		}
		return null;
	}

	@Override
	public Customer CustomerFindByID(int id) {
		boolean flag = customerRepository.existsById(id);
		if (flag) {
			Customer customer = customerRepository.findById(id).get();
			return customer;
		}

	
		return null;
	}



	@Override
	public String deleteCustomer(int id) {
	
		boolean flag = customerRepository.existsById(id);
		
		if(flag)
		{
			customerRepository.deleteById(id);
			
			return "Deleted Customer Successfully";
		}
		
		return "ID IS not find it";
	}

}
