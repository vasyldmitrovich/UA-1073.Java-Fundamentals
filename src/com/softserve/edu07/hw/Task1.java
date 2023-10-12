package com.softserve.edu07.hw;


import java.util.Arrays;

public class Task1 {
    public static void task1() {
        Employee[] employees = new Employee[]{
                new SalariedEmployee("1", "Andrii", 2000, "None"),
                new SalariedEmployee("2", "Petro", 18000, "5595929"),
                new ContractEmployee("3", "Ivan", 120, "3554815", 120),
                new ContractEmployee("4", "Bob", 90, "2959451", 250),
                new ContractEmployee("5", "Alisa", 200, "1259726", 100)
        };
        System.out.println("Before sorting: ");
        printEmployees(employees);

        Arrays.sort(employees, new EmployeeComparator());
        System.out.println("After sorting:");
        printEmployees(employees);
    }

    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
