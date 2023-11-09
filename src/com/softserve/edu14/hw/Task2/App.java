package com.softserve.edu14.hw.Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static com.softserve.edu14.hw.Task2.Employee.mostPopularName;

public class App {
    public static void main(String[] args) {
        Employee empl1 = new Employee("Bob");
        Employee empl2 = new Employee("Din");
        Employee empl3 = new Employee("Sam");
        Employee empl4 = new Employee("Sam");

        List<Employee> employeeList = Arrays.asList(empl1, empl2, empl3, empl4);
        Stream<Employee> employeeStream = employeeList.stream();

        Optional<String> mostPopularName = mostPopularName(employeeStream);

        mostPopularName.ifPresent(name ->
                System.out.println("Most popular name: " + name)
        );
    }
}
