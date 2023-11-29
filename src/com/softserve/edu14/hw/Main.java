package com.softserve.edu14.hw;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Боб"),
                new Employee("Дін"),
                new Employee("Сем"),
                new Employee("Сем")
        );

        Optional<String> mostPopularName = findMostPopularName(employees);
        System.out.println(mostPopularName.orElse("No popular name found"));
    }

    private static Optional<String> findMostPopularName(List<Employee> employees) {
        Map<String, Long> nameCountMap = employees.stream()
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return nameCountMap.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }
}