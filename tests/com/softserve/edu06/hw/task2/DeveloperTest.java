package com.softserve.edu06.hw.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    void developerReport () {
        Employee employee = new Employee("Taras", 32, 32735.35);
        Developer developer = new Developer(employee, "Java engineer");
        String report = developer.report();
        String expected = "Name: Taras, Age: 32 years, Position: Java engineer, Salary: 32735.35.";

        assertEquals(report, expected);

    }
}