package com.hotel.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
