package com.softserve.edu06.hw.task2;

public class App {
    public static void main(String[] args) {//All good
        Employee[] employees = {
                new Employee("Taras", 25, 32500.00),
                new Employee("Badan", 19, 20000.00),

        };
        Developer[] developers = {
                new Developer("Nikita", 30, 52000.00, "Java Developer"),
                new Developer("Oleksyi", 20, 30000.00, "Java Developer")
        };
        System.out.println("Employee info:");
        for (var employee : employees) {
            System.out.println(employee.report());
        }
        System.out.println("Developer info:");
        for (var developer : developers) {
            System.out.println(developer.report());
        }
    }

}
