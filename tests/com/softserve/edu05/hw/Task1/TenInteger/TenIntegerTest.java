package com.softserve.edu05.hw.Task1.TenInteger;

import com.softserve.edu05.hw.Task1.FiveInteger.FiveInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TenIntegerTest {

    @Test
    void posiitveOrNotTest() {
        int[] data = {1,-5, 2, 3, -5, 1,-5, 2, 3, -5};
        boolean expeced = false;
        boolean res = TenInteger.posiitveOrNot (data);
        assertEquals(expeced, res);
    }

    @Test
    void ifPositiveTest() {
        int[] data = {1, 5, 2, 3, 5, 1,-5, 2, 3, -5};
        int expeced = 16;
        int res = TenInteger.ifPositive (data);
        assertEquals(expeced, res);
    }

    @Test
    void ifNotPositiveTest() {
        int[] data = {1, 5, 2, 3, 5, 1,-5, 2, 3, -5};
        int expeced = 1;
        int res = TenInteger.ifNotPositive (data);
        assertEquals(expeced, res);
    }
}