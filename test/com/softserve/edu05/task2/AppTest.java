package com.softserve.edu05.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void sum() {
        assertEquals(5, App.sum(2, 3));
        assertEquals(8, App.sum(7, 1));
    }
}