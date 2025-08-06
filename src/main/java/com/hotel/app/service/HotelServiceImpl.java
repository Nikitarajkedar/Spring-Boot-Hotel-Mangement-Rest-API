package com.hotel.app.service;

import org.springframework.stereotype.Service;

import com.hotel.app.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	private HotelRepository hotelRepository;

	public HotelServiceImpl(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}
}
