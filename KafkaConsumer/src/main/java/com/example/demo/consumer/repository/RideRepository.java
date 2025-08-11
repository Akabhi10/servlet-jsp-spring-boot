package com.example.demo.consumer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.consumer.entity.RideEntity;

public interface RideRepository extends JpaRepository<RideEntity, Long> {
}