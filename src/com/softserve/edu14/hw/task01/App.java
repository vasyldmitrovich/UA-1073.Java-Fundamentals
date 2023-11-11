package com.softserve.edu14.hw.task01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        populateProductList(list);
        System.out.println("All list:");
        list.forEach(System.out::println);
        System.out.println("Phones older than 1 year with price more than 3000:");
        list.stream()
                .filter(e -> e.getManufactureCategory().equals("Phone") &&
                        e.getPrice() > 3000 &&
                        e.getManufactureDate().plusYears(1).isBefore(LocalDate.now()))
                .forEach(System.out::println);
    }

    private static void populateProductList(List<Product> list) {
        list.add(new Product("Phone", LocalDate.of(2023, 01, 20), 4500));
        list.add(new Product("Tablet", LocalDate.of(2016, 11, 12), 6500));
        list.add(new Product("TV", LocalDate.of(2023, 6, 23), 35000));
        list.add(new Product("Phone", LocalDate.of(2022, 10, 10), 7000));
        list.add(new Product("Phone", LocalDate.of(2021, 12, 25), 2500));
        list.add(new Product("Tablet", LocalDate.of(2020, 2, 5), 12000));
        list.add(new Product("Tablet", LocalDate.of(2021, 7, 25), 6500));
        list.add(new Product("Laptop", LocalDate.of(2019, 4, 8), 32000));
        list.add(new Product("Tablet", LocalDate.of(2023, 6, 1), 15000));
        list.add(new Product("TV", LocalDate.of(2020, 11, 18), 35000));
        list.add(new Product("Phone", LocalDate.of(2022, 11, 10), 12000));
        list.add(new Product("Laptop", LocalDate.of(2018, 3, 5), 28000));
        list.add(new Product("TV", LocalDate.of(2021, 1, 18), 50000));
        list.add(new Product("Laptop", LocalDate.of(2022, 9, 9), 28000));
        list.add(new Product("Phone", LocalDate.of(2022, 11, 1), 6000));
        list.add(new Product("TV", LocalDate.of(2018, 10, 10), 35000));
        list.add(new Product("Tablet", LocalDate.of(2015, 1, 14), 7000));
        list.add(new Product("Phone", LocalDate.of(2021, 5, 5), 9000));
        list.add(new Product("Laptop", LocalDate.of(2021, 8, 13), 27000));
        list.add(new Product("Laptop", LocalDate.of(2022, 8, 24), 43000));
    }
}
