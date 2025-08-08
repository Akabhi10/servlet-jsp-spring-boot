package com.example.demo.formvalidation.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {

    @NotBlank(message = "{name.required}")
    @Size(min = 3, max = 20, message = "{name.size}")
    private String name;

    @NotBlank(message = "{email.required}")
    @Email(message = "{email.invalid}")
    private String email;

    @NotBlank(message = "{password.required}")
    @Size(min = 6, message = "{password.size}")
    private String password;

    // Getters & Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
