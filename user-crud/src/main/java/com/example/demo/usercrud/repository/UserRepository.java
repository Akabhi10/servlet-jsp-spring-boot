package com.example.demo.usercrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.usercrud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}