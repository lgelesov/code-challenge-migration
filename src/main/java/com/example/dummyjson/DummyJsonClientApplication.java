package com.example.dummyjson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DummyJsonClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(DummyJsonClientApplication.class, args);
    }
}