package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ClassKLM {

    @Autowired
    @Qualifier("classABC")  // You can change to "classXYZ" if needed
    private InterfacePQR pqr;

    public void show() {
        pqr.display();
    }
}