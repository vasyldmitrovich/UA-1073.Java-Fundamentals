package com.softserve.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private InputStream oldIn;

    @BeforeEach
    void saveSystemIn() {
        oldIn = System.in;
    }

    @AfterEach
    void restoreSystemIn() {
        System.setIn(oldIn);
    }

    @Test
    void maxNumbersTest() {
        int[] data = {1, 2, 3, 4, 3, 2, 1};
        int expectedMax = 4;

        var res = App.maxNumber(data);

        assertEquals(expectedMax, res);
    }

    @Test
    void askClientsForArrayOfIntsTest() {
        provideInput("1 2 3 4 3 2 1");
        int[] expectedArr = {1, 2, 3, 4, 3, 2, 1};

        var res = App.askClientsForArrayOfInts();

        assertArrayEquals(expectedArr, res);
    }

    @Test
    void reportTest() {
        var old = System.out;
        var os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));

        int max = 12;
        String expectedSuffix = String.valueOf(max);

        App.report(max);

        System.setOut(old);

        assertTrue(os.toString()
                .stripTrailing()
                .endsWith(expectedSuffix),
                "The output is: " + os);
    }

    private void provideInput(String text) {
        System.setIn(new ByteArrayInputStream(
                text.getBytes()
        ));
    }
}