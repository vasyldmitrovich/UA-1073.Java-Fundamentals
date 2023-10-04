package com.softserve.edu6.hw.task2;

import com.softserve.edu06.hw.task2.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeTest {
    @Test
    void testReport(){
        Employee employee = new Employee("Taras", 32, 32735.35);
        Assertions.assertEquals("Name: Taras, Age: 32 years, Salary: ₴32735.35", employee.report());
    }
}
