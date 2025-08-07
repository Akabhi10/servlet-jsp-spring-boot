package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Account;

@RestController
public class AccountController {

    @GetMapping("/users/{id}/accounts")
    public List<Account> getAccounts(
            @PathVariable String id,
            @RequestParam String type,
            @RequestParam String status) {

        // Just for demo: return a list with one account
        Account account = new Account(id, type, status);
        return Arrays.asList(account);
    }
}
