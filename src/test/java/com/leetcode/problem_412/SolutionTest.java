package com.leetcode.problem_412;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void example_1() {
        String[] expectedResult = {"1", "2", "Fizz"};

        Solution solver = new Solution();
        List<String> result = solver.fizzBuzz(3);

        assertArrayEquals(result.toArray(), expectedResult);
    }

    @Test
    void example_2() {
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz"};

        Solution solver = new Solution();
        List<String> result = solver.fizzBuzz(5);

        assertArrayEquals(result.toArray(), expectedResult);
    }

    @Test
    void example_3() {
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

        Solution solver = new Solution();
        List<String> result = solver.fizzBuzz(15);

        assertArrayEquals(result.toArray(), expectedResult);
    }
}