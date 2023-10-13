package com.softserve.edu07.hw.Task1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Employee[] employees = {
                new ContactEmployee("Natalia", "Lawyer", "23-450-45", 100, 400, "14"),
                new ContactEmployee("Andriy", "Teacher", "11-433-23", 100, 120, "8"),
                new SalariedEmployee("Yura", "Developer", "54-79-00", 120000, "67389-783"),
                new SalariedEmployee("Masha", "Designer", "66-12-89", 80000, "45200-432"),
        };

        Arrays.sort(employees, Comparator.comparingDouble(employee -> employee.calculate()));
        List<Employee> employeeList = Arrays.asList(employees);

        for (Employee employee : employees) {
            employee.promptEmployee();
        }

    }
}
