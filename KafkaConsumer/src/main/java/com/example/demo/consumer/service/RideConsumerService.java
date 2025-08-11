package com.example.demo.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.demo.consumer.entity.RideEntity;
import com.example.demo.consumer.repository.RideRepository;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RideConsumerService {

    private final RideRepository rideRepository;
    private final ObjectMapper objectMapper;

    public RideConsumerService(RideRepository rideRepository, ObjectMapper objectMapper) {
        this.rideRepository = rideRepository;
        this.objectMapper = objectMapper;
    }

    @KafkaListener(topics = "${app.kafka.topic}", groupId = "ride_group")
    public void consume(String message) {
        try {
            JsonNode jsonNode = objectMapper.readTree(message);
            String operation = jsonNode.get("operation").asText();

            switch (operation) {
                case "CREATE":
                case "UPDATE":
                    RideEntity ride = objectMapper.treeToValue(jsonNode, RideEntity.class);
                    rideRepository.save(ride);
                    System.out.println("Saved ride: " + ride.getId());
                    break;
                case "DELETE":
                    Long id = jsonNode.get("id").asLong();
                    rideRepository.deleteById(id);
                    System.out.println("Deleted ride: " + id);
                    break;
                default:
                    System.out.println("Unknown operation: " + operation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
