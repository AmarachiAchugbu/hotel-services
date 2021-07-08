package com.example.hotelservices.controller;

import com.example.hotelservices.model.Hotel;
import com.example.hotelservices.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;

    @GetMapping("/hotel")
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @PostMapping("/hotel")
    public Hotel addNewHotel(@RequestBody Hotel hotel) {
        return hotelRepository.save(hotel);
    }
}



