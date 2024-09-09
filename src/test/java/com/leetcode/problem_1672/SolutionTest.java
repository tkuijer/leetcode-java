package com.leetcode.problem_1672;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example_1() {
        int[][] input = {
                {1,2,3},
                {3,2,1}
        };
        int expectedResult = 6;

        Solution solver = new Solution();

        assertEquals(solver.maximumWealth(input), expectedResult);
    }

    @Test
    void example_2() {
        int[][] input = {
                {1,5},
                {7,3},
                {3,5}
        };
        int expectedResult = 10;

        Solution solver = new Solution();

        assertEquals(solver.maximumWealth(input), expectedResult);
    }

    @Test
    void example_3() {
        int[][] input = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        int expectedResult = 17;

        Solution solver = new Solution();

        assertEquals(solver.maximumWealth(input), expectedResult);
    }
}