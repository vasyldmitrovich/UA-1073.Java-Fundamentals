package com.softserve.edu14.hw.Task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Stream<Employee> employeeStream = createEmployeeStream();
        Optional<String> mostPopularName = mostPopularName(employeeStream);
        System.out.println("Most popular name: " + mostPopularName.orElse("No employees"));
    }

    private static Stream<Employee> createEmployeeStream() {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );
        return employees.stream();
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}