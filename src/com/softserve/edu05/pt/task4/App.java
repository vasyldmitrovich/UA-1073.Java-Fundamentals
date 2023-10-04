package com.softserve.edu05.pt.task4;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Zinnyk Oleksyi", 322, 25000.00));
        employees.add(new Employee("Babenik Anton", 420, 20000.00));
        employees.add(new Employee("Krasickiy Andryi", 100, 22000.00));
        employees.add(new Employee("Vlasyk Vova", 322, 19500.00));
        employees.add(new Employee("Radashov Bogdan", 420, 23500.00));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input departament number: ");
        int departmentNumber = scanner.nextInt();

        System.out.println("All employees of a " + departmentNumber + " department:");
        for (Employee employee : employees) {
            if (employee.getNumberVid() == departmentNumber) {
                System.out.println("PIB: " + employee.getPIB() + ", Salary: " + employee.getSalary());
            }
        }

        Collections.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        System.out.println("\nEmployees in descending order of salary:");
        for (Employee employee : employees) {
            System.out.println("PIB: " + employee.getPIB() + ", Salary: " + employee.getSalary());
        }
    }
}
