package com.example.portfolio.demo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.demo.Service.HelloService;
import com.example.portfolio.demo.dto.request.GreetingRequest;
import com.example.portfolio.demo.dto.response.GreetingResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")
public class HelloController {
    private final HelloService service;

    public HelloController(HelloService service) {
        this.service = service;
    }

    @PostMapping("/hello")
    public ResponseEntity <GreetingResponse> hello(
            @RequestBody GreetingRequest request) {

        GreetingResponse response = service.greet(request.name());
        return ResponseEntity.ok(response);
    }
}