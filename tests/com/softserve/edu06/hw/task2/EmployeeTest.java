package com.softserve.edu06.hw.task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void employeeReport () {
        Employee employee = new Employee("Taras", 32, 32735.35);
        String report = employee.report();
        String expected = "Name: Taras, Age: 32, Salary: \u20b432735.35.";

        assertEquals(report, expected);
    }
}