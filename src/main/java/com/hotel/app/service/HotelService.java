package com.hotel.app.service;

import com.hotel.app.model.Hotel;

public interface HotelService {

	Hotel saveHotel(Hotel hotel);

	Hotel getDataById(Integer id);


	Hotel updateHotelsData(Integer id, Hotel hotel);


}
