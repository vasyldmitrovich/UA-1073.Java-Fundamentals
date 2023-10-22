package com.softserve.edu06.hw.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DeveloperTest {
    @Test
    void testReport(){
        Employee developer = new Developer("Taras", 32, 32735.35, "Average Java developer");
        Assertions.assertEquals("Name: Taras, Age: 32 years, Salary: ₴32735.35, Position: Average Java developer", developer.report());
    }
}