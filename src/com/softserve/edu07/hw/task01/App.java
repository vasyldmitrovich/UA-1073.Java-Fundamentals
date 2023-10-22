package com.softserve.edu07.hw.task01;

import java.util.Arrays;

public class App {//Ok
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new SalariedEmployee("1", "Christian", "32587443", 15, 156);
        employees[1] = new ContractEmployee("2", "Robert", "TX258974", 3299);
        employees[2] = new ContractEmployee("3", "Ann", "NJ487563", 4499);
        employees[3] = new SalariedEmployee("4", "John", "54896234", 23, 172);
        employees[4] = new SalariedEmployee("5", "Valery", "45628739", 17, 120);
        employees[5] = new ContractEmployee("6", "Jill", "OH481235", 3799);
        printAllEmployees(employees, "Basic array:");
        Arrays.sort(employees, new MonthlyPaymentComparator().reversed());
        printAllEmployees(employees, "Sorted array:");
    }
    private static void printAllEmployees(Employee[] employees, String message) {
        System.out.println(message);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }

    }
}
