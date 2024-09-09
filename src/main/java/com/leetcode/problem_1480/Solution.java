package com.leetcode.problem_1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int currentSum = 0;

        for(int index = 0; index < nums.length; index++) {
            currentSum += nums[index];
            result[index] = currentSum;
        }

        return result;
    }
}
