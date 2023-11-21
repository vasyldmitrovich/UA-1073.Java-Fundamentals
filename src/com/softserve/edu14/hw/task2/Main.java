package com.softserve.edu14.hw.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static Optional<String> findMostPopularName(List<Employee> employees) {
        if (employees.isEmpty()) {
            return Optional.empty();
        }

        Map<String, Long> nameFrequencyMap = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        Optional<Map.Entry<String, Long>> mostPopularEntry = nameFrequencyMap.entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue));

        return mostPopularEntry.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Sam")
        );

        Optional<String> mostPopularName = findMostPopularName(employees);

        mostPopularName.ifPresent(name -> System.out.println("Most popular name: " + name));
    }
}