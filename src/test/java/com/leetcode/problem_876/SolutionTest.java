package com.leetcode.problem_876;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void example_1() {
        ListNode middleNode = new ListNode(3, new ListNode(4, new ListNode(5)));
        ListNode list = new ListNode(1, new ListNode(2, middleNode));
        Solution solver = new Solution();

        assertEquals(solver.middleNode(list), middleNode);
    }

    @Test
    void example_2() {
        ListNode middleNode = new ListNode(4, new ListNode(5, new ListNode(6)));
        ListNode list = new ListNode(1, new ListNode(2, new ListNode(3, middleNode)));
        Solution solver = new Solution();

        assertEquals(solver.middleNode(list), middleNode);
    }
}