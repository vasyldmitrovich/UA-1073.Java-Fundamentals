package com.softserve.edu05.hw.Task2;

import com.softserve.edu05.hw.Task1.FiveInteger.FiveInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void countSum() {
        int[] data = {1,2};
        int expeced = 3;
        int res = Numbers.countSum(data);
        assertEquals(expeced, res);
    }
}