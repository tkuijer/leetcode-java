package com.leetcode.explore.arrays.even_number_of_digits;

public class Solution {
    public int findNumbers(int[] nums) {
        int foundCount = 0;

        // Loop through numbers
        for(int n: nums) {
            // Determine amount of digits
            int amountOfDigits = String.valueOf(n).length();

            // Determine if digit amount is even
            if(amountOfDigits % 2 == 0) {
                foundCount++;
            }
        }

        return foundCount;
    }
}
