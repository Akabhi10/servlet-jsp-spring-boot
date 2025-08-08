package com.example.demo.delivery.service;


import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DeliveryService {

    private static final String DELIVERY_SERVICE = "deliveryService";

    private final RestTemplate restTemplate = new RestTemplate();

    @CircuitBreaker(name = DELIVERY_SERVICE, fallbackMethod = "fallbackMethod")
    public String fetchStatus() {
        String url = "http://localhost:8081/delivery/status"; 
        return restTemplate.getForObject(url, String.class);
    }

    // Fallback method must match the signature of fetchStatus() + Throwable
    public String fallbackMethod(Throwable throwable) {
        return "Fallback: Delivery status temporarily unavailable.";
    }
}
