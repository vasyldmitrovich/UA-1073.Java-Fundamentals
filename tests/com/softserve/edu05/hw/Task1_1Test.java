package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1_1Test {


    @Test
    void getDayInMonthTest1() {
        int month = 2;
        int expected = 28;
        int res = Task1_1.getDayInMonth(month);
        assertEquals(expected, res);


    }

    @Test
    void getDayInMonthTest2() {
        int month = 1;
        int expected = 31;
        int res = Task1_1.getDayInMonth(month);
        assertEquals(expected, res);
    }

    @Test
    void getDayInMonthTest3() {
        int month = 6;
        int expected = 30;
        int res = Task1_1.getDayInMonth(month);
        assertEquals(res, expected);
    }
}