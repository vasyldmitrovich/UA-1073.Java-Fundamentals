package com.softserve.edu07.hw.Task1;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("E001", "SSN001", 5000);
        employees[1] = new SalariedEmployee("E002", "SSN002", 6000);
        employees[2] = new ContractEmployee("E003", "FTI001", 15.0, 160);
        employees[3] = new ContractEmployee("E004", "FTI002", 20.0, 140);

        Arrays.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                double wage1 = emp1.calculatePay();
                double wage2 = emp2.calculatePay();
                return Double.compare(wage2, wage1);
            }
        });

        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.employeeId);
            System.out.println("Employee Type: " + employee.getName());
            System.out.println("Average Monthly Wage: " + employee.calculatePay());
            System.out.println();
        }
    }
}
