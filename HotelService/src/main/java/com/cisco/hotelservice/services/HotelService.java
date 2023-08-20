package com.cisco.hotelservice.services;

import java.util.List;

import com.cisco.hotelservice.entites.Hotel;

public interface HotelService {

    //create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id);

}
