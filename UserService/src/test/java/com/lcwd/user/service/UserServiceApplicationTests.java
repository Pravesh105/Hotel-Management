package com.lcwd.user.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.cisco.userservice.entities.Rating;
import com.cisco.userservice.external.services.RatingService;

@SpringBootTest
class UserServiceApplicationTests {

    @Test
    void contextLoads() {
    }


    @Autowired
    private RatingService ratingService;

  //  @Test
//    void createRating() {
//        Rating rating = Rating.builder().rating(10).userId("").hotelId("").feedback("this is created using feign client").build();
////        ResponseEntity<Rating> ratingResponseEntity = ratingService.createRating(rating);
//        System.out.println("new rating created");
//    }


}
