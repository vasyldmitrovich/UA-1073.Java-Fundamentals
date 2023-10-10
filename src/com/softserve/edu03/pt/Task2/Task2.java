package com.softserve.edu03.pt.Task2;


import java.util.Scanner;

public class Task2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main() {
        Employee e1 = createEmployee();
        System.out.println(e1);
        Employee e2 = createEmployee();
        System.out.println(e2);
        Employee e3 = createEmployee();
        System.out.println(e3);

        System.out.println("Total Salary: " + Employee.totalSalary);
        System.out.println("Total Sum with bonuses: " + Employee.totalSum);
    }

    public static Employee createEmployee() {
        System.out.println("Input name of employee:");
        String name = scanner.nextLine();
        System.out.println("Input rate for '" + name + "' :");
        double rate = scanner.nextDouble();
        System.out.println("Input hours for '" + name + "' :");
        int hours = scanner.nextInt();
        scanner.nextLine();

        return new Employee(name, rate, hours);
    }
}
