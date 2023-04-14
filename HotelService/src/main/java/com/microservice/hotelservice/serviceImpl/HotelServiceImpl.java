package com.microservice.hotelservice.serviceImpl;

import com.microservice.hotelservice.entity.Hotel;
import com.microservice.hotelservice.exception.ResourceNotFoundException;
import com.microservice.hotelservice.repository.HotelRepository;
import com.microservice.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelService hotelService;

    @Autowired
    private HotelRepository hotelRepository;

    // Creating a hotel
    @Override
    public Hotel createHotel(Hotel hotel) {
        String randomHotelId = UUID.randomUUID().toString();
        hotel.setHotelId(randomHotelId);
        Hotel createdHotel = hotelRepository.save(hotel);
        return createdHotel;
    }

    // fetching hotel info by hotelId
    @Override
    public Hotel getHotelById(String hotelId) {
        Hotel hotelById = hotelRepository.findById(hotelId).orElseThrow(
                    ()-> new ResourceNotFoundException("Resource with hotelId not found :"+hotelId ));
        return hotelById;
    }

    // fetching all hotel data
    @Override
    public List<Hotel> getAllHotel() {
        return hotelRepository.findAll();
    }
}
