package com.microservice.hotelservice.controller;

import com.microservice.hotelservice.entity.Hotel;
import com.microservice.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    // Create hotel controller
    @PostMapping("/")
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel createdHotel = hotelService.createHotel(hotel);
        return new ResponseEntity<>(createdHotel, HttpStatus.CREATED);
    }

    // Get hotel by id controller
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
        Hotel hotelById = hotelService.getHotelById(hotelId);
        return new ResponseEntity<>(hotelById, HttpStatus.FOUND);
    }

    // Get all hotels controller
    @GetMapping("/")
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> allHotels = hotelService.getAllHotel();
        return new ResponseEntity<>(allHotels, HttpStatus.OK);
    }


}
