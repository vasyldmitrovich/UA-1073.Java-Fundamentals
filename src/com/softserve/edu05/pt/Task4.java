package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task4 {
    public static void run() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Sarah", 1, 5000);
        employees[1] = new Employee("Boris", 2, 4000);
        employees[2] = new Employee("Susanne", 2, 8000);
        employees[3] = new Employee("Jill", 2, 6000);
        employees[4] = new Employee("Robert", 1, 5500);
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
        for (int i = 0; i < employees.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    Employee tmp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = tmp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
        System.out.print("Enter department number: ");
        Scanner console = new Scanner(System.in);
        int enteredDepartmentNumber = console.nextInt();
        console.nextLine();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartmentNumber() == enteredDepartmentNumber) {
                System.out.println(employees[i].toString());
            }
        }
    }
}
