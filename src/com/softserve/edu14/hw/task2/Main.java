package com.softserve.edu14.hw.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John"),
                new Employee("Jane"),
                new Employee("John"),
                new Employee("Tom"),
                new Employee("John"),
                new Employee("Jane")
        );

        Optional<String> mostPopularName = Employee.mostPopularName(employees.stream());

        System.out.println("The most popular name on the list: " + mostPopularName.orElse("not available"));
    }
}
