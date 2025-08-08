package com.hotel.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.model.Hotel;
import com.hotel.app.service.HotelService;

@RestController
@RequestMapping(value = "/api")
public class HotelController {

	private HotelService hotelService;

	public HotelController(HotelService hotelService) {
		super();
		this.hotelService = hotelService;
	}

	//Post URL- http://localhost:9090/api/hotels	
	@PostMapping(value = "/hotels")
	public ResponseEntity<Hotel> SaveHotel(@RequestBody Hotel hotel) {

		Hotel savehotel = hotelService.SaveHotel(hotel);

		return new ResponseEntity<Hotel>(savehotel, HttpStatus.CREATED);
	}

	//Get URL- http://localhost:9090/api/hotels/1
	
	@GetMapping(value = "/hotels/{id}")
	public ResponseEntity<Hotel> getDataById(@PathVariable Integer id) {

		Hotel dbHotel = hotelService.getDataById(id);

		if (dbHotel != null) {

			return new ResponseEntity<Hotel>(dbHotel, HttpStatus.OK);

		}

		return new ResponseEntity<Hotel>(dbHotel, HttpStatus.NO_CONTENT);
	}

	// URL- http://localhost:9090/api/hotels/1

	@PatchMapping(value = "/hotels/{id}")
	public ResponseEntity<Hotel> partiallyUpdatHotelsData(@PathVariable Integer id, @RequestBody Hotel hotel) {

		Hotel updatedHotel = hotelService.updateHotelsData(id, hotel);

		if (updatedHotel != null) {

			return new ResponseEntity<Hotel>(updatedHotel, HttpStatus.OK);

		}

		return new ResponseEntity<Hotel>(updatedHotel, HttpStatus.NO_CONTENT);

	}

}
