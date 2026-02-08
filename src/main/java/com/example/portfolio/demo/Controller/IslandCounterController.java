package com.example.portfolio.demo.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.demo.Service.IslandCounterService;
import com.example.portfolio.demo.dto.request.IslandRequest;
import com.example.portfolio.demo.dto.response.IslandResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class IslandCounterController {
    private final IslandCounterService service;

    IslandCounterController(IslandCounterService service) {
        this.service = service;
    }
    @PostMapping("/islandCounter")
    public ResponseEntity<IslandResponse> count(@RequestBody IslandRequest request) {
        IslandResponse response = service.count(request.grid(), request.connectivity());
        return ResponseEntity.ok(response);
    }
}
