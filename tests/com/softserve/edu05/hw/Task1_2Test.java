package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import static com.softserve.edu05.hw.Task1_2.*;
import static org.junit.jupiter.api.Assertions.*;

class Task1_2Test {
    private int[] array1 = {8, 1, 5, 9, 4, -8, 2, 7, 4, 1};
    private int[] array2 = {4, 0, 5, 4, 7, 8, 1, -7, 2, 9};
    private int[] array3 = {4, 5, -4, 3, 5, -7, 7, -2, 1, -3};
    @Test
    void testIsFirstFivePositive() {
        assertTrue(isFirstFivePositive(array1));
        assertFalse(isFirstFivePositive(array2));
        assertFalse(isFirstFivePositive(array3));
    }

    @Test
    void testFirstFiveSum() {
        assertEquals(27, firstFiveSum(array1));
        assertEquals(20, firstFiveSum(array2));
        assertEquals(13, firstFiveSum(array3));
    }

    @Test
    void testLastFiveProduct() {
        assertEquals(-448, lastFiveProduct(array1));
        assertEquals(-1008, lastFiveProduct(array2));
        assertEquals(-294, lastFiveProduct(array3));
    }
}