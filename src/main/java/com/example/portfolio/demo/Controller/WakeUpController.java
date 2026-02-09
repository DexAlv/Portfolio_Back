package com.example.portfolio.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.demo.Service.WakeUpService;
import com.example.portfolio.demo.dto.response.WakeUpResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

//Wakey Wakey it's time for school

@RestController
@RequestMapping("/api")
public class WakeUpController {
    private final WakeUpService service;

    public WakeUpController(WakeUpService service) {
        this.service = service;
    }

    @GetMapping("/wakeup")
    public ResponseEntity<WakeUpResponse> wakeup() {
        WakeUpResponse response = service.wakeup();
        return ResponseEntity.ok(response);
    }
}