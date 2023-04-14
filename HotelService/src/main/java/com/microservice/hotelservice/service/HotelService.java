package com.microservice.hotelservice.service;

import com.microservice.hotelservice.entity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HotelService {

    // Create hotel
    Hotel createHotel(Hotel hotel);

    // Get Hotel By id
    Hotel getHotelById(String hotelId);

    // Get All hotel
    List<Hotel> getAllHotel();


}
