package com.softserve.edu05.task1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class DialogCreatorTest {
    DataProvider dataProvider = new DataProvider();

    @Test
    void testGetDaysInMonths() {
        assertEquals(31, dataProvider.getDaysInMonths(1));
        assertEquals(28, dataProvider.getDaysInMonths(2));
        assertEquals(30, dataProvider.getDaysInMonths(6));
    }


    @Test
    void testGetFirstFive() {
        assertEquals(19, dataProvider.getFirstFive(new int[]{2, 3, 5, 4, 5, 7, 4, 2, 1, 3}));
        assertEquals(-168, dataProvider.getFirstFive(new int[]{-2, -2, -5, -4, -5, -7, -4, -2, -1, -3}));
    }

    @Test
    void testFindSecondPositive() {
        assertEquals(3, dataProvider.findSecondPositive(new int[]{-2, 3, -5, 2}));
        assertEquals(2, dataProvider.findSecondPositive(new int[]{-1, 4, 5}));
    }

    @Test
    void testFindMinimum() {
        assertArrayEquals(new int[]{-1, 4}, dataProvider.findMinimum(new int[]{3, 2, 5, 7, -1}));
        assertArrayEquals(new int[]{0, 1}, dataProvider.findMinimum(new int[]{1, 0, 2, 3, 9, 10}));
    }

    @Test
    void testCalculateProduct() {
        assertEquals(384, dataProvider.calculateProduct(new int[]{1, 2, 3, 4, 5, 6, 7, 8}));
        assertEquals(96, dataProvider.calculateProduct(new int[]{3, 4, 2, 3, 5, 6, 2, 9}));
    }

}