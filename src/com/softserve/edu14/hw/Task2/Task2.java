package com.softserve.edu14.hw.Task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task2 {
    public static void main(String[] args) {
        // Example stream of Employee objects
        Stream<Employee> employeeStream = Stream.of(
                new Employee("Bob"),
                new Employee("Din"),
                new Employee("Sam"),
                new Employee("Bart"),
                new Employee("Homer"),
                new Employee("Nelson"),
                new Employee("Bart")
        );

        Optional<String> mostPopularName = mostPopularName(employeeStream);

        System.out.println("Most Popular Name: " + mostPopularName.orElse("No name found"));
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {

        Map<String, Long> nameCountMap = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));


        Optional<Map.Entry<String, Long>> maxEntry = nameCountMap.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        return maxEntry.map(Map.Entry::getKey);
    }
}
