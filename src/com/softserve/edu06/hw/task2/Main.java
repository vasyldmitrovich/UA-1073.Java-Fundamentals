package com.softserve.edu06.hw.task2;

public class Main {
    public static void main(String[] args) {//Ok
        Employee employee = new Employee("John", 30, 50000.0);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        System.out.println("Employee Information:");
        System.out.println(employee.report());

        System.out.println("\nDeveloper Information:");
        System.out.println(developer.report());
    }
}

