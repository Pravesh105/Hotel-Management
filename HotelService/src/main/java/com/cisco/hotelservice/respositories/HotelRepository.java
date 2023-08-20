package com.cisco.hotelservice.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cisco.hotelservice.entites.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
	
}

