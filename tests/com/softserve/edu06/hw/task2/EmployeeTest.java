package com.softserve.edu06.hw.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testReport(){
        Employee employee = new Employee("Taras", 32, 32735.35);
        Assertions.assertEquals("Name: Taras, Age: 32 years, Salary: ₴32735.35", employee.report());
    }
}