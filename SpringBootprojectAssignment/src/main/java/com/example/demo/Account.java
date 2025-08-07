package com.example.demo;

public class Account {
    private String id;
    private String type;
    private String status;

    public Account(String id, String type, String status) {
        this.id = id;
        this.type = type;
        this.status = status;
    }

    public String getId() { return id; }
    public String getType() { return type; }
    public String getStatus() { return status; }

    public void setId(String id) { this.id = id; }
    public void setType(String type) { this.type = type; }
    public void setStatus(String status) { this.status = status; }
}
