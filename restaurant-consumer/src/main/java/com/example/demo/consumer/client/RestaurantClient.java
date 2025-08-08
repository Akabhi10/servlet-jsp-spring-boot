package com.example.demo.consumer.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.consumer.model.Restaurant;

@FeignClient(name = "restaurant-producer")
public interface RestaurantClient {
    @GetMapping("/restaurants")
    List<Restaurant> getRestaurants();
}