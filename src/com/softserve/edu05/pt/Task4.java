package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void task4() {

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Andrii", 1, 1200);
        employees[1] = new Employee("Ivan", 3, 5700);
        employees[2] = new Employee("Petro", 2, 200);
        employees[3] = new Employee("Oleksandr", 1, 4300);
        employees[4] = new Employee("Vasyl", 1, 15700);

        getAllEmployeeInOneDepartment(employees);

        System.out.println(Arrays.toString(employees));
        arrangeEmployeesBySalary(employees);
        System.out.println(Arrays.toString(employees));
    }

    public static void getAllEmployeeInOneDepartment(Employee[] employees) {
        Scanner scanner = new Scanner(System.in);

        int department = 0;
        while (true) {
            try {
                System.out.print("Input a number department: ");
                department = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number! Try again.");
            }
        }
        boolean found = false;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartmentNumber() == department) {
                System.out.println(employees[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Employees in " + department + " department not found.");
        }
    }

    public static void arrangeEmployeesBySalary(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j + 1].getSalary() > employees[j].getSalary()) {
                    swap(employees, j, j + 1);
                }
            }
        }
    }

    public static void swap(Employee[] employees, int idx1, int idx2) {
        Employee tmp = employees[idx1];
        employees[idx1] = employees[idx2];
        employees[idx2] = tmp;
    }

}
