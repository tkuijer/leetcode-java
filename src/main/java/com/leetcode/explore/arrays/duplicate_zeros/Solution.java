package com.leetcode.explore.arrays.duplicate_zeros;

public class Solution {
    public void duplicateZeros(int[] arr) {
        // Loop through all numbers in array
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                continue;
            }

            // Shift right part 1 position
            for(int j = arr.length - 2; j >= i; j--) {
                arr[j + 1] = arr[j];
            }

            // Insert 0 at current index
            arr[i] = 0;

            // Increment 1 more time, because the next index will be 0
            i++;
        }
    }
}
