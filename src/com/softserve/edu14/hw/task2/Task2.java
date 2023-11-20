package com.softserve.edu14.hw.task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static Optional<String> findMostPopularName(Stream<Employee> employeeStream) {
        Map<String, Long> nameFrequency = employeeStream
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        Optional<Map.Entry<String, Long>> mostCommonName = nameFrequency.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        return mostCommonName.map(Map.Entry::getKey);
    }

    public static void main(String[] args) {

        Employee empl1 = new Employee("Vova");
        Employee empl2 = new Employee("Boni");
        Employee empl3 = new Employee("Piter");
        Employee empl4 = new Employee("Vova");
        Employee empl5 = new Employee("Boni");
        Employee empl6 = new Employee("Vova");


        List<Employee> employees = Arrays.asList(empl1, empl2, empl3, empl4);
        Optional<String> popularName = findMostPopularName(employees.stream());

        popularName.ifPresentOrElse(
                name -> System.out.println("The most popular name: " + name + "."),
                () -> System.out.println("Stream is empty.")
        );
    }
}
