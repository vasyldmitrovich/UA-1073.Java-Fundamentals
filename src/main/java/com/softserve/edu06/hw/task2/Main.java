package com.softserve.edu06.hw.task2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Vasya", 29, 15432.25),
                new Developer("Taras", 32, 32735.35, "Average Java developer"),
                new Developer("Ivan", 35, 50500.0, "Senior Java Developer")
        };

        printEmployeesInfo(employees);
    }

    private static void printEmployeesInfo(Employee[] employees){
        System.out.println("Information about employees:");
        for (Employee employee : employees){
            System.out.printf("\t%s.%n", employee.report());
        }
    }
}
