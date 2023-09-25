package com.softserve.edu03.pt.task2;

import static com.softserve.edu03.pt.task2.Employee.getTotalSum;

public class Task2 {
    public static void pt2() {
        Employee employee = new Employee("c",23,4);
        Employee employee1 = new Employee("a",15,27);
        Employee employee2 = new Employee("b",3,5);

        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("Total Sum Employee:" + employee.getSalary());
        System.out.println("Total Sum Employee1:" + employee1.getSalary());
        System.out.println("Total Sum Employee2:" + employee2.getSalary());
    }
}
