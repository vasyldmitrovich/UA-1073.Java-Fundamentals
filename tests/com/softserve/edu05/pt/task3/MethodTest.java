package com.softserve.edu05.pt.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MethodTest {

    @Test
    public void testFindMaxNumber() {
        int[] mas = {3, 7, 1, 9, 5};
        int expectedMaxNumber = 9;

        int maxNumber = Method.maxMasNumber(mas);

        assertEquals(expectedMaxNumber, maxNumber);
    }

    @Test
    public void testSumPositivNums() {
        int[] mas = {3, -2, 1, -4, 5};
        long expectedSum = 9;

        long sum = Method.sumPositivNums(mas);

        assertEquals(expectedSum, sum);
    }

    @Test
    public void testNumerosityNegativeNums() {
        int[] mas = {3, -2, 1, -4, 5};
        int expectedCounter = 2;

        int counter = Method.numerosityNegativeNums(mas);

        assertEquals(expectedCounter, counter);
    }

    @Test
    public void testPositiveVsNegative() {
        int[] mas = {3, -2, 1, -4, 5};
        String expectedMessage = "There are more positive values in the array.";

        String message = Method.positiveVsNegative(mas);

        assertEquals(expectedMessage, message);
    }
}