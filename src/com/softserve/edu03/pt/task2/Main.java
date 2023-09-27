package com.softserve.edu03.pt.task2;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee1 = createEmployee(scanner);
        Employee employee2 = createEmployee(scanner);
        Employee employee3 = createEmployee(scanner);

        double totalSalary = employee1.getSalary() + employee2.getSalary() + employee3.getSalary();

        System.out.println("Total Salary of All Employees: " + totalSalary);

        scanner.close();
    }

    private static Employee createEmployee(Scanner scanner) {
        System.out.println("Enter employee information:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Hourly Rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Hours Worked: ");
        double hours = scanner.nextDouble();
        scanner.nextLine();

        return new Employee(name, rate, hours);
    }
}
