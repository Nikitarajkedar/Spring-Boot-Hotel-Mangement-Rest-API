package com.hotel.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.model.Hotel;

public interface HotelRepository  extends JpaRepository<Hotel, Integer>{

}
