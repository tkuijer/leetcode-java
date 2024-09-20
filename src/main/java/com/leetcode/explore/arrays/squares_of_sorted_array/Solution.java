package com.leetcode.explore.arrays.squares_of_sorted_array;

import java.util.Arrays;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] out = new int[length];

        // Loop through numbers
        for(int i = 0; i < length; i++) {
            // Square number
            out[i] = nums[i] * nums[i];
        }

        // Sort smallest first
        Arrays.sort(out);

        return out;
    }
}
