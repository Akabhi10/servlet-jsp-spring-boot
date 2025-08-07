package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showForm() {
        return "register"; // loads register.html
    }

    @PostMapping("/register")
    @ResponseBody
    public String handleForm(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String email,
            @RequestParam String birthday,
            @RequestParam String profession) {

        return "<h2>Registration Successful!</h2>" +
                "<p>Username: " + username + "</p>" +
                "<p>Password: " + password + "</p>" +
                "<p>Email: " + email + "</p>" +
                "<p>Birthday: " + birthday + "</p>" +
                "<p>Profession: " + profession + "</p>";
    }
}
