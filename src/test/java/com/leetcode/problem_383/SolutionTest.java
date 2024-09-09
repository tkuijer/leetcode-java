package com.leetcode.problem_383;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    @Test
    void example_1() {
        String note = "a";
        String magazine = "b";

        Solution solver = new Solution();

        assertFalse(solver.canConstruct(note, magazine));
    }

    @Test
    void example_2() {
        String note = "aa";
        String magazine = "ab";

        Solution solver = new Solution();

        assertFalse(solver.canConstruct(note, magazine));
    }

    @Test
    void example_3() {
        String note = "aa";
        String magazine = "aab";

        Solution solver = new Solution();

        assertTrue(solver.canConstruct(note, magazine));
    }
}