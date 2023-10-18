package com.softserve.edu07.hw.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding employees with different forms of payment
        employees.add(new SalariedEmployee("A1", "John Smith", "123-45-6789", 4000.0));
        employees.add(new ContractEmployee("B1", "Alice Johnson", "987-65-4321", 25.0, 160));
        employees.add(new SalariedEmployee("C1", "Bob Wilson", "111-22-3333", 5000.0));
        employees.add(new ContractEmployee("D1", "Eva Davis", "444-55-6666", 30.0, 120));
        employees.add(new ContractEmployee("E1", "Mark Miller", "777-88-9999", 20.0, 180));

        // Sort employees by employee ID (A to E) and average monthly wage in descending order
        Collections.sort(employees, Comparator.comparing(employee -> employee.getEmployeeId()));

        // Output employee ID, name, and average monthly wage
        for (Employee employee : employees) {
            System.out.println("Employee ID: " + employee.getEmployeeId());
            System.out.println("Employee Name: " + employee.getEmployeeName());
            System.out.println("Average Monthly Wage: " + employee.calculatePay());
            System.out.println();
        }
    }
}