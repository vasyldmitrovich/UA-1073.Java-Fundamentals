package com.softserve.edu06.hw;

import com.softserve.edu06.hw.task2.Developer;
import com.softserve.edu06.hw.task2.Employee;

public class App {
    public static void main (String[] args) {
        // Task 2
        Employee employee = new Employee("Taras", 32, 32735.35);
        Developer developer = new Developer(employee, "Java engineer");

        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
