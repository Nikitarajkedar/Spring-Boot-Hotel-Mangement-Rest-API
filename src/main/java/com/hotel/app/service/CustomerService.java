package com.hotel.app.service;



import java.util.List;


import com.hotel.app.model.Customer;

public interface CustomerService {


	Customer CustomerFindByID(int id);


	List<Customer> getCustomerDataByPage(Integer pageNumber, Integer size);


	Customer saveCustomer(Customer customer);

	Customer updatById(Integer id, Customer customer);



	
}
