package com.softserve.edu06.hw.Task2;

public class Task2 {
    public static void main(String[] args) {
        Employee employee = new Employee("Mark", 23, 50000.0);
        Developer developer = new Developer("Taras", 32, 32735.35, "Average Java developer");

        employee.allInfo();
        developer.allInfo();
    }
}