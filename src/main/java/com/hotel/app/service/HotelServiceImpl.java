package com.hotel.app.service;

import org.springframework.stereotype.Service;

import com.hotel.app.model.Hotel;
import com.hotel.app.repository.HotelRepository;

@Service
public class HotelServiceImpl implements HotelService {

	private HotelRepository hotelRepository;

	public HotelServiceImpl(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}


	@Override
	public Hotel saveHotel(Hotel hotel) {
		Hotel save = hotelRepository.save(hotel);
		return save;
	}
}
