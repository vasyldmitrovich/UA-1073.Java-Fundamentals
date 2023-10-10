package com.softserve.edu05.pt.Task4;

import java.sql.Array;
import java.util.Scanner;

public class Task4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter next information about employees:");

        Employee[] employees = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Department Number: ");
            int departmentNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            employees[i] = new Employee(name, departmentNumber, salary);
        }

        System.out.print("Enter the department number to filter employees: ");
        int departmentFilter = scanner.nextInt();

        System.out.println("Employees in department " + departmentFilter + ":");
        for (Employee employee : employees) {
            if (employee.getDepartmentNumber() == departmentFilter) {
                System.out.println(employee);
            }
        }

        System.out.println("\nEmployees sorted by salary in descending order:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
