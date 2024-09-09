package com.leetcode.problem_383;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int index;
        String firstPart, secondPart;

        for (char c : ransomNote.toCharArray()) {
            index = magazine.indexOf(c);

            // Character not found
            if (index == -1) {
                return false;
            }

            // 'consume' character from magazine
            firstPart = magazine.substring(0, index);
            secondPart = magazine.substring(index + 1);

            magazine = firstPart + secondPart;
        }

        return true;
    }
}
