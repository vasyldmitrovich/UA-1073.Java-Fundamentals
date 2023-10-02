package com.softserve.edu05.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGenerateRandomNumber() {
        int randomNumber = App.generateRandomNumber();

        assertTrue(randomNumber >= 0 && randomNumber < 1000, "Generated number is out of range");
        assertEquals(0, randomNumber % 1, "Generated number is not an integer");
    }
}