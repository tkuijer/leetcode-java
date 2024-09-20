package com.leetcode.explore.arrays.even_number_of_digits;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void example_1() {
        int[] input = {12,345,2,6,7896};

        Solution solver = new Solution();

        assertEquals(2, solver.findNumbers(input));
    }

    @Test
    void example_2() {
        int[] input = {555, 901,482,1771};

        Solution solver = new Solution();

        assertEquals(1, solver.findNumbers(input));
    }
}