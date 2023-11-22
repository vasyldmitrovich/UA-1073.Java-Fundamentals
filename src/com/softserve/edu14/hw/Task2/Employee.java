package com.softserve.edu14.hw.Task2;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

import static java.lang.System.out;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Employee {
private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static void mostPopularName (Stream <Employee> employees) {
        Optional<Stream<Employee>> op = Optional.ofNullable(employees);
        employees
                .map( el -> el.getName())
                .collect(groupingBy(el -> el, counting()
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(1)
                .forEach(e-> out.println( "The most popular name is " + e.getKey()));



    }
}
