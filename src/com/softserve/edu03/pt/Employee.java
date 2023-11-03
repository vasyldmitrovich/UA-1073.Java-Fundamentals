package com.softserve.edu03.pt;

import java.util.Scanner;

public class Employee {

    private static double totalSum = 0;
    private String name;
    private int rate;
    private double hours;

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, double hours) {
        totalSum -= getSalary();
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        totalSum -= getSalary();
        this.rate = rate;
        totalSum += getSalary();
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum -= getSalary();
        this.hours = hours;
        totalSum += getSalary();
    }

    public static double getTotalSum() {
        return totalSum;
    }

    public double getBonuses() {
        return getSalary() * 0.1;
    }

    public double getSalary() {
        return rate * hours;
    }

    //Move this method at the end of class
    //Remember about order of fields and methods in class
    public static void initializeEmployee(Employee employee) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter the employee's name: ");
                employee.name = scanner.nextLine();
                System.out.print("Enter the employee's rate: ");
                employee.rate = scanner.nextInt();
                System.out.print("Enter the employee's hours: ");
                employee.hours = scanner.nextDouble();
                totalSum += employee.getSalary();
                break;
            } catch (Exception e) {
                System.out.println("Wrong number! Try again.");
                scanner.nextLine();
            }
        }
    }
}
