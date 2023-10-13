package com.softserve.edu05.pt.Task4;

import java.util.Arrays;
import java.util.Scanner;

import static com.softserve.edu05.pt.Task4.Main.SCANNER;

public class Employee {
    private String name;
    private int departmentNumber;
    private int salary;

    //constructors
    public Employee() {
    }

    public Employee(String name, int departmentNumber, int salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentNumber=" + departmentNumber +
                ", salary=" + salary +
                '}';
    }

    static Employee[] employees = new Employee[5];

    public static void createEmployeeArrey() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Input name of employee");
            String name = SCANNER.nextLine();
            System.out.println("Input salary");
            int salary = SCANNER.nextInt();
            SCANNER.nextLine();
            System.out.println("Input department number");
            int departmentNumber = SCANNER.nextInt();
            SCANNER.nextLine();
            employees[i] = new Employee(name, departmentNumber, salary);
        }
    }

    public static void sortBySalary(Employee[] employees) {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - i - 1; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    swap(employees, j, j + 1);
                }
            }
        }
    }

    public static void swap(Employee[] employees, int i, int j) {
        Employee swap = employees[i];
        employees[i] = employees[j];
        employees[j] = swap;
    }

    public static void search() {
        System.out.println("Input the number of department");
        int num = SCANNER.nextInt();
        int counter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartmentNumber() == num) {
                counter++;
            }
        }
        System.out.println("In " + num + " department " + counter + " employees.");
    }

    public static void printSortedObject() {
        System.out.println("Workers have been arranged by the field salary in descending order:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(Employee.employees[i].toString());
        }
    }
}
