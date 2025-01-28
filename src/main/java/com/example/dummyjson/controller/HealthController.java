package com.example.dummyjson.controller;

import com.example.dummyjson.dto.HealthStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {

    @GetMapping
    public ResponseEntity<HealthStatus> checkHealth() {
        return ResponseEntity.ok(new HealthStatus("UP"));
    }
}