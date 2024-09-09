package com.leetcode.problem_1672;

public class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int currentAccountWealth;

        for (int[] account : accounts) {
            currentAccountWealth = 0;

            for (int i : account) {
                currentAccountWealth += i;
            }

            if (currentAccountWealth > maxWealth) {
                maxWealth = currentAccountWealth;
            }
        }

        return maxWealth;
    }
}
