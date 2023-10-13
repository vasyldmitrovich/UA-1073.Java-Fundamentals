package com.softserve.edu05.hw.Task1.FiveInteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiveIntegerTest {

    @Test
    void secondPositive() {
        int[] data = {1,-5,2};
        int expeced = 2;
        int res = FiveInteger.secondPositive(data);
        assertEquals(expeced, res);
    }

    @Test
    void foundMin() {
        int[] data = {1, 2, 3, -1, -2, -3};
        int expected =  -3;
        int res = FiveInteger.foundMin(data);
        assertEquals(expected, res);
    }

    @Test
    void ptodFrEven() {
        int[] data = {1, 2, 3, -1, -2, -3};
        int expected =  -4;
        int res = FiveInteger.ptodFrEven(data);
        assertEquals(expected, res);
    }
}