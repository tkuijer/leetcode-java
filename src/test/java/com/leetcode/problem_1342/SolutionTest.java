package com.leetcode.problem_1342;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example_1() {
        Solution solver = new Solution();

        assertEquals(6, solver.numberOfSteps(14));
    }

    @Test
    void example_2() {
        Solution solver = new Solution();

        assertEquals(4, solver.numberOfSteps(8));
    }

    @Test
    void example_3() {
        Solution solver = new Solution();

        assertEquals(12, solver.numberOfSteps(123));
    }

    @Test
    void input_is_zero() {
        Solution solver = new Solution();

        assertEquals(0, solver.numberOfSteps(0));
    }
}