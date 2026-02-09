package com.example.portfolio.demo.Service.Impl;

import org.springframework.stereotype.Service;

import com.example.portfolio.demo.Service.WakeUpService;
import com.example.portfolio.demo.dto.response.WakeUpResponse;

@Service
public class WakeUpServiceImpl implements WakeUpService{

    @Override
    public WakeUpResponse wakeup() {
        return new WakeUpResponse(true);
    }
}
