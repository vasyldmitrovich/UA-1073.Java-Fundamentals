package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Bob", 5, 13000);
        employees[1] = new Employee("Mark", 7, 7500);
        employees[2] = new Employee("Ann", 9, 8000);
        employees[3] = new Employee("Alice", 7, 24000);
        employees[4] = new Employee("Max", 3, 14500);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Department Number: ");
        int inputDepNum = scanner.nextInt();
        System.out.println("Employee department " + inputDepNum + ":");
        for (Employee employee : employees){
            if (employee.getDepartmentNumber() == inputDepNum){
                System.out.println(employee.getName());
            }
        }
        Arrays.sort(employees, (e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " - salary: " + employee.getSalary());
        }
    }

    private String name;
    private int departmentNumber;
    private double salary;

    public Employee(String name, int departmentNumber, double salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public double getSalary() {
        return salary;
    }

    public String toString() {
        return "Name: " + getName() + " Department Number: " + getDepartmentNumber() + " Salary: " + getSalary();
    }
}
