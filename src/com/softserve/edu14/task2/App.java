package com.softserve.edu14.task2;

import com.softserve.edu14.task1.Product;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        fillList(employees);
        System.out.println(mostPopularName(employees.stream()).orElse("Name wasn't found"));

    }
    public static void fillList(List<Employee> employees) {
        employees.add(new Employee("John", 75000, "Developer"));
        employees.add(new Employee("Susan", 85000, "Manager"));
        employees.add(new Employee("James", 55000, "Analyst"));
        employees.add(new Employee("Patricia", 95000, "Director"));
        employees.add(new Employee("John", 65000, "Developer"));
        employees.add(new Employee("Linda", 73000, "Designer"));
    }
    public static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
               .map(Employee::getName)
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
               .entrySet()
               .stream()
               .max(Map.Entry.comparingByValue())
               .map(Map.Entry::getKey);
    }
}
