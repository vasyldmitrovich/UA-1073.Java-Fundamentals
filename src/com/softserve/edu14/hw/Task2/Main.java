package com.softserve.edu14.hw.Task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        Stream <Employee> stream = Stream.of(
                new Employee("Anna"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Bob"),
                new Employee("Anna"),
                new Employee("Anna"),
                new Employee("Alex"),
                new Employee("Alex"),
                new Employee("Mark")
        );
        Employee.mostPopularName(stream);

    }
}
