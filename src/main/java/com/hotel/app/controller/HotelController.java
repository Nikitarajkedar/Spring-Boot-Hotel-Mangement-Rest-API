package com.hotel.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.model.Hotel;
import com.hotel.app.service.HotelService;

@RestController
public class HotelController {

	private HotelService hotelService;

	public HotelController(HotelService hotelService) {
		super();
		this.hotelService = hotelService;
	}

	@PostMapping(value = "/hotels")
	public ResponseEntity<Hotel> saveHotel(@RequestBody Hotel hotel) {
		Hotel hotels = hotelService.saveHotel(hotel);

		return new ResponseEntity<Hotel>(hotels, HttpStatus.CREATED);
	}

}
