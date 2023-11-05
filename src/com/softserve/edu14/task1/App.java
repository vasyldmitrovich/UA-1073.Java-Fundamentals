package com.softserve.edu14.task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        fillList(products);

        List<Product> filtered = filter(products);
        print(filtered);


    }

    public static List<Product> filter(List<Product> products) {
        return products.stream()
                .filter(p -> p.getManufacturerCategory().equals("Telephone")
                        && p.getPrice() > 3000
                        && (LocalDate.now().getYear() - p.getDateOfManufacture().getYear()) > 1)
                .collect(Collectors.toList());
    }
    public static void print(List<Product> products) {
        products.forEach(System.out::println);
    }

    public static void fillList(List<Product> products) {
        products.add(new Product("Electronics", LocalDate.of(2023, 1, 1), 1000));
        products.add(new Product("Electronics", LocalDate.of(2023, 1, 15), 1500));
        products.add(new Product("Home Appliances", LocalDate.of(2022, 12, 1), 500));
        products.add(new Product("Computers", LocalDate.of(2023, 1, 12), 2000));
        products.add(new Product("Telephone", LocalDate.of(2019, 2, 5), 750));
        products.add(new Product("Telephone", LocalDate.of(2022, 11, 25), 650));
        products.add(new Product("Gardening", LocalDate.of(2023, 3, 19), 300));
        products.add(new Product("Gardening", LocalDate.of(2022, 10, 13), 400));
        products.add(new Product("Sporting Goods", LocalDate.of(2023, 4, 7), 550));
        products.add(new Product("Sporting Goods", LocalDate.of(2023, 1, 20), 250));
        products.add(new Product("Books", LocalDate.of(2022, 5, 17), 150));
        products.add(new Product("Books", LocalDate.of(2023, 3, 5), 175));
        products.add(new Product("Toys", LocalDate.of(2023, 2, 25), 120));
        products.add(new Product("Toys", LocalDate.of(2023, 1, 10), 110));
        products.add(new Product("Clothing", LocalDate.of(2023, 2, 17), 300));
        products.add(new Product("Clothing", LocalDate.of(2022, 12, 20), 220));
        products.add(new Product("Telephone", LocalDate.of(2012, 11, 30), 5000));
        products.add(new Product("Jewelry", LocalDate.of(2023, 3, 10), 6000));
        products.add(new Product("Telephone", LocalDate.of(2015, 1, 23), 4000));
        products.add(new Product("Shoes", LocalDate.of(2023, 2, 11), 900));
    }

}
