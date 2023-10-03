package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1_2Test {


    @Test
    void solveTaskTest1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 15;
        int actual = Task1_2.solveTask(arr);
        assertEquals(expected, actual);
    }

    @Test
    void solveTaskTest2() {
        int[] arr = new int[]{1, 2, 3, 4, 5, -6, 7, 8, 9, 10};
        int expected = -30240;
        int actual = Task1_2.solveTask(arr);
        assertEquals(expected, actual);
    }
}