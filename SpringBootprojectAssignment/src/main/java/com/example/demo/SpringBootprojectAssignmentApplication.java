package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootprojectAssignmentApplication implements CommandLineRunner {

    @Autowired
    private ClassKLM klm;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootprojectAssignmentApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        klm.show();
    }
}
