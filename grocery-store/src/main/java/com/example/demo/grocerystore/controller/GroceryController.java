package com.example.demo.grocerystore.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.security.access.prepost.PreAuthorize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class GroceryController {

    // Temporary in-memory storage
    private List<String> orders = new ArrayList<>(Arrays.asList(
            "Order1: Apples x2",
            "Order2: Milk x1"
    ));

    @GetMapping("/grocery/public")
    public String publicMessage() {
        return "Welcome to the Grocery Store!";
    }

    @GetMapping("/grocery/items")
    public List<String> getItems() {
        return Arrays.asList("Apples", "Bananas", "Milk", "Bread");
    }

    @GetMapping("/grocery/orders")
    public List<String> getOrders() {
        return orders;
    }

    // NEW — Handle POST requests
    @PostMapping("/grocery/orders")
    public String addOrder(@RequestBody OrderRequest order) {
        String newOrder = "Order" + (orders.size() + 1) + ": " + order.getItem() + " x" + order.getQuantity();
        orders.add(newOrder);
        return "Order added: " + newOrder;
    }

    @GetMapping("/grocery/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminOnly() {
        return "Admin access granted!";
    }

    // DTO class for request body
    public static class OrderRequest {
        private String item;
        private int quantity;

        // Getters & Setters
        public String getItem() {
            return item;
        }
        public void setItem(String item) {
            this.item = item;
        }
        public int getQuantity() {
            return quantity;
        }
        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }
}
