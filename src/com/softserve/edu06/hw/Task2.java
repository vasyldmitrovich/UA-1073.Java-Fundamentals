package com.softserve.edu06.hw;

public class Task2 {
    public static void task2() {
        Employee[] employees = new Employee[]{
                new Employee("Andrii", 19, 2000),
                new Developer("Ivan", 24, 10000, "Senior Java developer"),
                new Developer("Taras", 32, 32735.35,"Average Java developer"),
                new Developer("Kostya", 27, 800, "Trainee Java developer"),
                new Employee("Dmytro", 23, 0)
        };
        for (var employee : employees) {
            System.out.println(employee.report());
        }
    }
}
