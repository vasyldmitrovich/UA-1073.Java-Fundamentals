package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import static com.softserve.edu05.hw.Task1_3.*;
import static org.junit.jupiter.api.Assertions.*;

class Task1_3Test {
    private int[] array1 = {-4, 5, 0, 2, 8};
    private int[] array2 = {-3, -8, 0, 5, 6};
    private int[] array3 = {-5, 4, 0, 2, -8};
    @Test
    void testSecondPositiveIndex() {
        assertEquals(3, secondPositiveIndex(array1));
        assertEquals(4, secondPositiveIndex(array2));
        assertEquals(3, secondPositiveIndex(array3));
    }

    @Test
    void testMinValueIndex() {
        assertEquals(0, minValueIndex(array1));
        assertEquals(1, minValueIndex(array2));
        assertEquals(4, minValueIndex(array3));
    }

    @Test
    void testEvenProduct() {
        assertEquals(-64, evenProduct(array1));
        assertEquals(-48, evenProduct(array2));
        assertEquals(-64, evenProduct(array3));
    }
}