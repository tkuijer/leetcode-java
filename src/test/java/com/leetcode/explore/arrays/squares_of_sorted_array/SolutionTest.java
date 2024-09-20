package com.leetcode.explore.arrays.squares_of_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void example_1() {
        int[] input = {-4,-1,0,3,10};
        int[] expectedOutput = {0,1,9,16,100};

        Solution solver = new Solution();

        assertArrayEquals(expectedOutput, solver.sortedSquares(input));
    }

    @Test
    void example_2() {
        int[] input = {-7,-3,2,3,11};
        int[] expectedOutput = {4,9,9,49,121};

        Solution solver = new Solution();

        assertArrayEquals(expectedOutput, solver.sortedSquares(input));
    }
}