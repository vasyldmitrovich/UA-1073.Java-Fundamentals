package com.softserve.edu07.hw.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class EmployeeTest {
    Employee[] employees;

    @BeforeEach
    void createArray(){
        employees = new Employee[]{
                new ContractEmployee("1", "John", "52122146", 5, 8), //40
                new SalariedEmployee("2", "Ivan", "7544441", 500.0), //500
                new SalariedEmployee("3", "Ilya", "4444444", 60.0), //60
                new ContractEmployee("4", "Bohdan", "532142", 9, 12) //108
        };
    }

    @Test
    @DisplayName("Checking the sorting of employees in descending order")
    void testSort(){
        Employee[] sorted = {
                new SalariedEmployee("2", "Ivan", "7544441", 500.0),
                new ContractEmployee("4", "Bohdan", "532142", 9, 12),
                new SalariedEmployee("3", "Ilya", "4444444", 60),
                new ContractEmployee("1", "John", "52122146", 5, 8)
        };

        Arrays.sort(employees);
        assertArrayEquals(sorted, employees);
    }

    @Test
    @DisplayName("Checking payroll calculation in SalariedEmployee")
    void testCalculateSalaried(){
        Employee employee = new SalariedEmployee("1", "Ivan", "775451", 1200);
        assertEquals(1200, employee.calculatePay());
    }

    @Test
    @DisplayName("Checking payroll calculation in ContractEmployee")
    void testCalculateContract(){
        Employee employee = new ContractEmployee("1", "Ivan", "775451", 12, 10);
        assertEquals(120, employee.calculatePay());
    }
}
