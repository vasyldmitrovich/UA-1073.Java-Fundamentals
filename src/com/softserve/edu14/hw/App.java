package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class App {

    public static void main(String[] args) {

//HW 1 - List of products

        List<Product> list = extracted();
//        System.out.println(list);

        List<Product> sorted = list
                .stream()
                .filter(i -> i.getCategory().equals(ManufactureCategory.PHONE))
                .filter(x -> x.getPrice() > 3000)
                .filter(y -> y.getManufactureDate().isBefore(LocalDate.now().minusYears(1)))
                .toList();
        System.out.println(sorted);

//HW 2
        Employee emp1 = new Employee("Bob");
        Employee emp2 = new Employee("Din");
        Employee emp3 = new Employee("Sam");
        Employee emp4 = new Employee("Sam");
        List<Employee> list1 = Arrays.asList(emp1, emp2, emp3, emp4);

        Stream<Employee> str = list1.stream();
        Optional<String> opt = mostPopularName(str);
        System.out.println(opt.orElse("There's no employees"));
    }

    static Optional<String> mostPopularName(Stream<Employee> employees) {
        return employees
                .map(Employee::getName)
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }


    private static List<Product> extracted() {
        return Arrays.asList(
                new Product(ManufactureCategory.PHONE, 2021, 1, 10, 1000),
                new Product(ManufactureCategory.PHONE, 2021, 2, 11, 2000),
                new Product(ManufactureCategory.PHONE, 2021, 3, 12, 3000),
                new Product(ManufactureCategory.PHONE, 2021, 4, 13, 4000),
                new Product(ManufactureCategory.PHONE, 2021, 5, 14, 5000),
                new Product(ManufactureCategory.PHONE, 2022, 1, 10, 1000),
                new Product(ManufactureCategory.PHONE, 2022, 2, 11, 2000),
                new Product(ManufactureCategory.PHONE, 2022, 3, 12, 3000),
                new Product(ManufactureCategory.PHONE, 2022, 4, 13, 4000),
                new Product(ManufactureCategory.PHONE, 2022, 5, 14, 5000),
                new Product(ManufactureCategory.PHONE, 2023, 1, 10, 1000),
                new Product(ManufactureCategory.PHONE, 2023, 2, 11, 2000),
                new Product(ManufactureCategory.PHONE, 2023, 3, 12, 3000),
                new Product(ManufactureCategory.PHONE, 2023, 4, 13, 4000),
                new Product(ManufactureCategory.PHONE, 2023, 5, 14, 5000),
                new Product(ManufactureCategory.PHONE, 2024, 1, 10, 1000),
                new Product(ManufactureCategory.PHONE, 2024, 2, 11, 2000),
                new Product(ManufactureCategory.PHONE, 2024, 3, 12, 3000),
                new Product(ManufactureCategory.PHONE, 2024, 4, 13, 4000),
                new Product(ManufactureCategory.PHONE, 2024, 5, 14, 5000)
        );
    }
}
