package com.leetcode.problem_876;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode currentNode = head;
        int listLength = 0;

        while (currentNode.next != null) {
            listLength++;

            currentNode = currentNode.next;
        }

        currentNode = head;
        int expectedIndex = Math.ceilDiv(listLength, 2);

        for (int i = 0; i < expectedIndex; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }
}
