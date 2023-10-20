package com.softserve.edu06.hw.Task2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Anna", 25, 30.5),
                new Developer("Mike", 30, 2000, "Developer")
        };
        for (var employee: employees) {
            System.out.println(employee.report());
        }
    }
}
