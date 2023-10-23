package com.softserve.edu06.hw.task2;

public class Task2Edu06Hw {
    public static void task2Edu06Hw() {

        Employee employee1 = new Employee("Artur", 30, 25.500);
        Employee employee2 = new Employee("Taras", 28, 26.800);
        Developer developer1 = new Developer("Boni", 19, 30.400, "Java Developer");
        Developer developer2 = new Developer("Lexi", 25, 24.300, "SMM Marketer");

        System.out.println(employee1.report());
        System.out.println(employee2.report());
        System.out.println(developer1.report());
        System.out.println(developer2.report());

    }


}
