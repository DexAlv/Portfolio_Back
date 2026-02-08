package com.example.portfolio.demo.Service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.springframework.stereotype.Service;

import com.example.portfolio.demo.Service.IslandCounterService;
import com.example.portfolio.demo.dto.response.IslandResponse;

@Service
public class IslandCounterServiceImpl implements IslandCounterService {
    @Override
    public IslandResponse count(int[][] grid, int connectivity) {
        int[] dx;
        int[] dy;

        int n = grid.length;
        boolean[][] visited = new boolean[n][n];

        List<List<int[]>> islands = new ArrayList<>();

        if (connectivity == 8) {
            dx = new int[] { 1, -1, 0, 0, -1, -1, 1, 1 };
            dy = new int[] { 0, 0, 1, -1, -1, 1, 1, -1 };
        } else {
            dx = new int[] { 1, -1, 0, 0 };
            dy = new int[] { 0, 0, 1, -1 };
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1 && !visited[i][j]) {
                    List<int[]> island = new ArrayList<>();
                    Stack<int[]> stack = new Stack<>();

                    stack.push(new int[] { i, j });
                    visited[i][j] = true;

                    while (!stack.isEmpty()) {
                        int[] cur = stack.pop();
                        int x = cur[0], y = cur[1];

                        island.add(new int[] {x, y});

                        for (int k = 0; k < dx.length; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];

                            if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
                                if (grid[nx][ny] == 1 && !visited[nx][ny]) {
                                    visited[nx][ny] = true;
                                    stack.push(new int[] { nx, ny });
                                }
                            }   
                        }
                    }

                    islands.add(island);
                }
            }
        }
        return new IslandResponse(islands);
    }
}
