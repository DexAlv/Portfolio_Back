package com.example.portfolio.demo.Service.Impl;

import org.springframework.stereotype.Service;

import com.example.portfolio.demo.Service.HelloService;
import com.example.portfolio.demo.dto.response.GreetingResponse;

@Service
public class HelloServiceImpl implements HelloService{

    @Override
    public GreetingResponse greet(String name) {
        return new GreetingResponse("Hola " + name + " bienvenido a mi portafolio");
    }
}
