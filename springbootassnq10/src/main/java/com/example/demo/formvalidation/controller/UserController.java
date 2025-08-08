package com.example.demo.formvalidation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.formvalidation.model.User;

import jakarta.validation.Valid;

@Controller
public class UserController {

    // Option 1: Access form via /form
    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "form"; // Must match form.html name
    }

    // Option 2: Access form via /register
    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("user", new User());
        return "form";
    }

    // Handle form submission
    @PostMapping("/register")
    public String submitForm(@Valid @ModelAttribute("user") User user,
                             BindingResult result) {
        if (result.hasErrors()) {
            return "form";
        }
        return "success";
    }
}
