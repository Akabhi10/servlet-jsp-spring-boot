package com.example.demo.producer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.producer.model.Restaurant;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @GetMapping
    public List<Restaurant> getRestaurants() {
        return Arrays.asList(
            new Restaurant(1, "Biryani House", "Bhubaneswar"),
            new Restaurant(2, "Tandoori Flames", "Brahmapur")
        );
        
    }
}