package com.softserve.edu07.hw.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContractEmployeeTest {

    @Test
    @DisplayName("Contract employee should receive monthly payment")
    void calculatePay () {
        ContractEmployee employee = new ContractEmployee("Employee", "1", "1", 1000);

        assertEquals(employee.calculatePay(), 1000);
    }
}