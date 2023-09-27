package com.softserve.edu03.pt.Task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //Nice, very nice ;-)

        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[3];
        double totalSalary = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Hourly Rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Hours Worked: ");
            double hours = scanner.nextDouble();
            scanner.nextLine();

            employees[i] = new Employee(name, rate, hours);
            totalSalary += employees[i].getSalary();
        }

        System.out.println("\nEmployee Information:");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

        System.out.println("Total Salary of All Employees: $" + totalSalary);
    }
}