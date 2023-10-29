package com.softserve.edu07.hw.task1;

import java.util.Arrays;
import java.util.Comparator;

public class Task1Edu07Hw {
    public static void task1() {

        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("123", "123456", 37600);
        employees[1] = new SalariedEmployee("321", "654321", 41500);
        employees[2] = new ContractEmployee("258", "999", 110, 184);
        employees[3] = new ContractEmployee("852", "333", 70, 230);

        Arrays.sort(employees, Comparator.comparingDouble(Employee::calculatePay).reversed());

        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeInfo() + ", Average Monthly Wage: "
                    + employee.calculatePay() + " GRN. ");
        }


    }
}
