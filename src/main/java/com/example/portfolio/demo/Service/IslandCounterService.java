package com.example.portfolio.demo.Service;

import com.example.portfolio.demo.dto.response.IslandResponse;

public interface IslandCounterService {
    IslandResponse count(int[][] grid, int connectivity);
}
