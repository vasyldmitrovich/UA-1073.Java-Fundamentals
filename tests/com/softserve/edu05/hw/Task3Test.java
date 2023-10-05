package com.softserve.edu05.hw;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static com.softserve.edu05.hw.Task1_3.findSecondPositiveNumber;
import static com.softserve.edu05.hw.Task3.getCarsByYear;
import static com.softserve.edu05.hw.Task3.sortCarByYear;
import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    void getCarsByYearTest() {
        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", 2010, 1.8);
        cars[1] = new Car("BMW", 2017, 3.0);
        cars[2] = new Car("Golf", 2000, 1.2);
        cars[3] = new Car("Nyva", 1990, 0.8);

        String expected = "Cars with 1999 year of production not found.";

        String input = "1999";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        getCarsByYear(cars);

        String actual = outputStream.toString().trim().replace("Enter the year of production: ", "");
        assertEquals(expected, actual);

        System.setOut(System.out);
    }

    @Test
    void sortCarByYearTest() {
        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", 2010, 1.8);
        cars[1] = new Car("BMW", 2017, 3.0);
        cars[2] = new Car("Golf", 2000, 1.2);
        cars[3] = new Car("Nyva", 1990, 0.8);

        Car[] expected = new Car[4];
        expected[0] = new Car("BMW", 2017, 3.0);
        expected[1] = new Car("Audi", 2010, 1.8);
        expected[2] = new Car("Golf", 2000, 1.2);
        expected[3] = new Car("Nyva", 1990, 0.8);

        sortCarByYear(cars);
        assertArrayEquals(expected, cars);
    }

    @Test
    void swap() {
        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", 2010, 1.8);
        cars[1] = new Car("BMW", 2017, 3.0);
        cars[2] = new Car("Golf", 2000, 1.2);
        cars[3] = new Car("Nyva", 1990, 0.8);

        Car[] expected = new Car[4];
        expected[0] = new Car("BMW", 2017, 3.0);
        expected[1] = new Car("Audi", 2010, 1.8);
        expected[2] = new Car("Golf", 2000, 1.2);
        expected[3] = new Car("Nyva", 1990, 0.8);
        Task3.swap(cars,0 ,1);
        assertArrayEquals(expected, cars);
    }
}