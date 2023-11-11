package com.softserve.edu14.hw.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        populateEmployees(employees);
        System.out.println("All employees names: ");
        employees.forEach(e -> System.out.println(e.getName()));
        System.out.println("Most popular name: ");
        System.out.println(mostPopularName(employees.stream()).orElse("No employees in this list!"));
    }

    private static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    private static void populateEmployees(List<Employee> employees) {
        employees.add(new Employee("Alex"));
        employees.add(new Employee("John"));
        employees.add(new Employee("Alex"));
        employees.add(new Employee("Sally"));
        employees.add(new Employee("John"));
        employees.add(new Employee("Bill"));
        employees.add(new Employee("Alex"));
        employees.add(new Employee("Jessica"));
        employees.add(new Employee("Sam"));
        employees.add(new Employee("Bill"));
    }
}
