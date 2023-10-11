package com.softserve.edu07.hw.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalariedEmployeeTest {
    @Test
    @DisplayName("Salaried employee should receive payment based on hourly rate and hours worked")
    void calculatePay () {
        SalariedEmployee employee = new SalariedEmployee("Employee", "1", "1", 25, 160);

        double expected = 25 * 160;

        assertEquals(employee.calculatePay(), expected);
    }
}