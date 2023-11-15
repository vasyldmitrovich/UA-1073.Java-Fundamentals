package com.softserve.edu14.hw.task2;

import com.softserve.edu10.pt.Employee;
import com.softserve.global.Global;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(createEmployee("Bob"));
        list.add(createEmployee("Sam"));
        list.add(createEmployee("Din"));
        list.add(createEmployee("Sam"));

        var mostPopular = mostPopularName(list.stream());
        System.out.println(mostPopular);
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees.map(i -> i.getName().toLowerCase())
                .filter(i -> !i.isEmpty())
                .collect(Collectors.groupingBy(
                        i -> i, Collectors.counting()
                ))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    public static Employee createEmployee(String name) {
        return new Employee(
                name,
                Global.getRandomString(10),
                Global.RANDOM.nextInt(0, 100000),
                Global.getRandomString(10));
    }

}
