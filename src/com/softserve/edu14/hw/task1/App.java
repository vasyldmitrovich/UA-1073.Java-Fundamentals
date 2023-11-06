package com.softserve.edu14.hw.task1;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        fillList(productList);

        printList(productList);
        List<Product> result = productList.stream()
                .filter(p -> p.getManufactureCategory().equals("Phone")
                        && p.getPrice() > 3000
                        && LocalDate.now().getYear() - p.getDateOfManufacture().getYear() > 1)
                .toList();

        System.out.println("Result:");
        printList(result);
    }

    public static void fillList(List<Product> productList) {
        productList.add(new Product("toy", LocalDate.of(2022, 2, 5), 3400));
        productList.add(new Product("phone", LocalDate.of(2021, 11, 12), 800));
        productList.add(new Product("computer", LocalDate.of(2022, 1, 3), 1500));
        productList.add(new Product("book", LocalDate.of(2021, 9, 18), 200));
        productList.add(new Product("clothing", LocalDate.of(2022, 4, 16), 500));
        productList.add(new Product("electronics", LocalDate.of(2022, 5, 21), 1200));
        productList.add(new Product("food", LocalDate.of(2021, 7, 2), 100));
        productList.add(new Product("jewelry", LocalDate.of(2021, 10, 15), 250));
        productList.add(new Product("toy", LocalDate.of(2022, 3, 7), 3200));
        productList.add(new Product("phone", LocalDate.of(2022, 2, 11), 850));
        productList.add(new Product("computer", LocalDate.of(2021, 12, 25), 1600));
        productList.add(new Product("book", LocalDate.of(2021, 6, 30), 220));
        productList.add(new Product("clothing", LocalDate.of(2021, 8, 18), 600));
        productList.add(new Product("electronics", LocalDate.of(2022, 2, 27), 1300));
        productList.add(new Product("food", LocalDate.of(2021, 5, 9), 120));
        productList.add(new Product("jewelry", LocalDate.of(2021, 4, 15), 270));
        productList.add(new Product("toy", LocalDate.of(2022, 1, 20), 3600));
        productList.add(new Product("phone", LocalDate.of(2021, 12, 2), 4500));
        productList.add(new Product("computer", LocalDate.of(2021, 7, 19), 1700));
        productList.add(new Product("book", LocalDate.of(2021, 3, 11), 240));
    }

    public static void printList(List<Product> list) {
        list.forEach(System.out::println);
    }
}
