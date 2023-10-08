package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import static com.softserve.edu05.hw.Task1_1.getMonthDays;
import static org.junit.jupiter.api.Assertions.*;

class Task1_1Test {

    @Test
    void testGetMonthDays() {
        assertEquals(28, getMonthDays(2));
        assertEquals(31, getMonthDays(12));
        assertEquals(30, getMonthDays(6));
    }
}