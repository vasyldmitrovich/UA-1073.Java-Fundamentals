package com.softserve.edu14.hw.task2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class TestEmployee {
    @Test
    void testMostPopularNameWithFullList() {
        String expectedName = "JOHN";

        List<Employee> employees = Arrays.asList(
                new Employee("John"),
                new Employee("Jane"),
                new Employee("John"),
                new Employee("Tom"),
                new Employee("John"),
                new Employee("Jane")
        );

        Optional<String> mostPopularName = Employee.mostPopularName(employees.stream());

        Assertions.assertEquals(expectedName, mostPopularName.orElse(""));
    }

    @Test
    void testMostPopularNameWithEmptyList() {
        String expectedName = "not available";

        List<Employee> employees = new ArrayList<>();

        Optional<String> mostPopularName = Employee.mostPopularName(employees.stream());

        Assertions.assertEquals(expectedName, mostPopularName.orElse("not available"));
    }
}
