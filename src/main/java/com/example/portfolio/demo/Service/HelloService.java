package com.example.portfolio.demo.Service;

import com.example.portfolio.demo.dto.response.GreetingResponse;

public interface HelloService {
    GreetingResponse greet(String name);
}