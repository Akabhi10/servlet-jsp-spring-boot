package com.example.demo.consumer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.consumer.entity.RideEntity;
import com.example.demo.consumer.repository.RideRepository;

@RestController
@RequestMapping("/rides")
public class RideController {

    private final RideRepository repository;

    public RideController(RideRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<RideEntity> getAllRides() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public RideEntity getRide(@PathVariable Long id) {
        return repository.findById(id).orElse(null);
    }
}
