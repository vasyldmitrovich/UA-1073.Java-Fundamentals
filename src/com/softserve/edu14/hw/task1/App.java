package com.softserve.edu14.hw.task1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Manufacturer 1", "Phone", LocalDate.now().minusYears(2), 4000));
        productList.add(new Product("Manufacturer 2", "Phone", LocalDate.now().minusYears(1), 5000));
        productList.add(new Product("Manufacturer 3", "Laptop", LocalDate.now().minusYears(1), 6000));
        productList.add(new Product("Manufacturer 3", "Phone", LocalDate.now().minusYears(3), 6000));

        List<Product> filteredProducts = productList.stream()
                .filter(p -> p.getCategory().equals("Phone"))
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        for (Product product : filteredProducts) {
            System.out.println(product);
        }

        List<Employee> employeeList = Arrays.asList(
                new Employee("John"),
                new Employee("Jane"),
                new Employee("John"),
                new Employee("Bob"),
                new Employee("Jane"),
                new Employee("Bob"),
                new Employee("John")
        );

        Optional<String> mostPopularName = mostPopularName(employeeList.stream());
        mostPopularName.ifPresent(name -> System.out.println("Most Popular Name: " + name));
    }
    static Optional<String> mostPopularName(Stream<Employee> employees) {
        Map<String, Long> nameCountMap = employees
                .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

        return nameCountMap.entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}