package com.leetcode.problem_1342;

public class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        }

        int stepCount = 0;

        do {
            stepCount++;

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
        } while (num >= 1);

        return stepCount;
    }
}
