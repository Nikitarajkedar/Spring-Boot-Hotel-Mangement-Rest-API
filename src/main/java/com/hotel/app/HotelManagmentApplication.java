package com.hotel.app;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotelManagmentApplication {
	@Bean
	public ModelMapper  getModelMapper() {
		ModelMapper modelMapper=new ModelMapper();
		//model MAPPER dependancy add
		//yane jecva 2 object map hot tevha to sarv map kart asto null dekhil jari apn pach kartane pathavle nahi tari tya mule apne ithe setSkipNullEnabled(true);yane null value update nahi honar mnanun hi line garjechi ahe
		modelMapper.getConfiguration().setSkipNullEnabled(true);
		return modelMapper;
	}
		
	public static void main(String[] args) {
		SpringApplication.run(HotelManagmentApplication.class, args);
	}

}
