package com.example.demo.resttemplate.controller;

import com.example.demo.resttemplate.model.Post;
import com.example.demo.resttemplate.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/posts")
    public Post[] getPosts() {
        return apiService.getPosts();
    }
}
