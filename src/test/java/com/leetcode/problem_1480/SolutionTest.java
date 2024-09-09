package com.leetcode.problem_1480;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example_1() {
        Solution solver = new Solution();

        int[] input = new int[]{1,2,3,4};
        int[] result = solver.runningSum(input);

        assertArrayEquals(
            new int[]{1,3,6,10},
            result
        );
    }

    @Test
    void example_2() {
        Solution solver = new Solution();

        int[] input = new int[]{1,1,1,1,1};
        int[] result = solver.runningSum(input);

        assertArrayEquals(
            new int[]{1,2,3,4,5},
            result
        );
    }

    @Test
    void example_3() {
        Solution solver = new Solution();

        int[] input = new int[]{3,1,2,10,1};
        int[] output = solver.runningSum(input);

        assertArrayEquals(
            new int[]{3,4,6,16,17},
            output
        );
    }
}