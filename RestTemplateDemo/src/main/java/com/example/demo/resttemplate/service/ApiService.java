package com.example.demo.resttemplate.service;

import com.example.demo.resttemplate.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiService {

    private final String BASE_URL = "https://jsonplaceholder.typicode.com";

    private final RestTemplate restTemplate = new RestTemplate();

    public Post[] getPosts() {
        return restTemplate.getForObject(BASE_URL + "/posts", Post[].class);
    }
}
