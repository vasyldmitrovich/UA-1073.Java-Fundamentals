package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.softserve.edu05.hw.Task1_3.*;
import static org.junit.jupiter.api.Assertions.*;

class Task1_3Test {

    @Test
    void findSecondPositiveNumber1() {
        int[] arr = {1, -2, 3, -4, 5};
        String expected = "The second positive number is: 3";


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        findSecondPositiveNumber(arr);

        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);

        System.setOut(System.out);

    }

    @Test
    void calculateTheProductTest() {
        int[] arr = {1, 2, 0, 4, 5};
        String expected = "Multiply all even numbers: 8";


        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        calculateTheProduct(arr);

        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);

        System.setOut(System.out);
    }

    @Test
    void findMinValueTest() {
        int[] arr = new int[]{5, 2, 4};
        String expected = "The minimum value is 2, index: 1";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        findMinValue(arr);

        String actual = outputStream.toString().trim();
        assertEquals(expected, actual);

        System.setOut(System.out);
    }

}