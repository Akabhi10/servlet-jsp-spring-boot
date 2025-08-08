package com.example.demo.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.delivery.service.DeliveryService;

@RestController
@RequestMapping("/consumer")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @GetMapping("/status")
    public String getDeliveryStatus() {
        return deliveryService.fetchStatus(); 
    }
}
