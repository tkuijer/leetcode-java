package com.leetcode.explore.arrays.duplicate_zeros;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example_1() {
        int[] input = {1,0,2,3,0,4,5,0};
        int[] expectedOutput = {1,0,0,2,3,0,0,4};

        Solution solver = new Solution();

        // Function modifies input internally
        solver.duplicateZeros(input);

        assertArrayEquals(expectedOutput, input);
    }

    @Test
    void example_2() {
        int[] input = {1,2,3};
        int[] expectedOutput = {1,2,3};

        Solution solver = new Solution();

        // Function modifies input internally
        solver.duplicateZeros(input);

        assertArrayEquals(expectedOutput, input);
    }

    @Test
    void start_with_zero() {
        int[] input = {0, 1,2,3};
        int[] expectedOutput = {0, 0, 1,2};

        Solution solver = new Solution();

        // Function modifies input internally
        solver.duplicateZeros(input);

        assertArrayEquals(expectedOutput, input);
    }
}