package com.example.demo.deliveryproducer.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryStatusController {

    @GetMapping("/status")
    public String getStatus() {
        return "Delivery is in progress!";
    }
}
