package com.hotel.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private ModelMapper modelmapper;

	@Override
	public Hotel SaveHotel(Hotel hotel) {

		Hotel saveHotel = hotelRepository.save(hotel);

		return saveHotel;
	}

	@Override
	public Hotel getDataById(Integer id) {

		if (hotelRepository.existsById(id)) {

			Hotel dbhotel = hotelRepository.findById(id).get();

			return dbhotel;

		}

		return null;
	}

	@Override
	public Hotel updateHotelsData(Integer id, Hotel hotel) {

		if (hotelRepository.existsById(id)) {

			Hotel dbHotel = hotelRepository.findById(id).get();

			modelmapper.map(hotel, dbHotel);

			Hotel updateHotel = hotelRepository.save(dbHotel);

			return updateHotel;
		
		}

		return null;
	}

}
