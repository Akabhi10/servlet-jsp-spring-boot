package com.example.demo.producer.controller;



import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.producer.model.Ride;
import com.example.demo.producer.service.RideProducerService;

@RestController
@RequestMapping("/rides")
public class RideController {

    private final RideProducerService producerService;

    public RideController(RideProducerService producerService) {
        this.producerService = producerService;
    }

    @PostMapping
    public String createRide(@RequestBody Ride ride) {
        ride.setOperation("CREATE");
        producerService.sendRide(ride);
        return "Ride create request sent to Kafka";
    }

    @PutMapping("/{id}")
    public String updateRide(@PathVariable Long id, @RequestBody Ride ride) {
        ride.setId(id);
        ride.setOperation("UPDATE");
        producerService.sendRide(ride);
        return "Ride update request sent to Kafka";
    }

    @DeleteMapping("/{id}")
    public String deleteRide(@PathVariable Long id) {
        Ride ride = new Ride();
        ride.setId(id);
        ride.setOperation("DELETE");
        producerService.sendRide(ride);
        return "Ride delete request sent to Kafka";
    }

    @GetMapping("/{id}")
    public String getRide(@PathVariable Long id) {
        return "Fetching ride details for id " + id; // Mock for now
    }
}
