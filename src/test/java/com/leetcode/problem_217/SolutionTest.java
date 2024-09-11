package com.leetcode.problem_217;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void example_1() {
        int[] input = {1, 2, 3, 1};
        boolean result = (new Solution()).containsDuplicate(input);

        assertTrue(result);
    }

    @Test
    void example_2() {
        int[] input = {1, 2, 3, 4};
        boolean result = (new Solution()).containsDuplicate(input);

        assertFalse(result);
    }

    @Test
    void example_3() {
        int[] input = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        boolean result = (new Solution()).containsDuplicate(input);

        assertTrue(result);
    }
}