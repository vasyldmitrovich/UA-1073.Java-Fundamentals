package com.softserve.edu14.hw.task2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        fillList(employeeList);
        Optional<String> result = mostPopularName(employeeList.stream());
        System.out.println(result.isPresent());
        result.ifPresent(System.out::println);
    }

    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> namesInList = employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        var mostPopular = namesInList
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        return mostPopular.map(Map.Entry::getKey);
    }

    public static void fillList(List<Employee> employeeList) {
        employeeList.add(new Employee("Bob", 1, 1200));
        employeeList.add(new Employee("Din", 3, 5700));
        employeeList.add(new Employee("Sam", 2, 200));
        employeeList.add(new Employee("Sam", 1, 4300));
        employeeList.add(new Employee("Ann", 1, 15700));
    }
}
