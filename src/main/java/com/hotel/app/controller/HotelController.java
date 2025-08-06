package com.hotel.app.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.service.HotelService;

@RestController
public class HotelController {

	private HotelService hotelService;

	public HotelController(HotelService hotelService) {
		super();
		this.hotelService = hotelService;
	}
	
	
	
	
}
