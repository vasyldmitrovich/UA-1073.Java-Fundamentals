package com.softserve.edu14.hw.Task1;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Product> products = createProductList();


        List<Product> filteredProducts = products.stream()
                .filter(p -> p.getCategory() == Category.PHONE)
                .filter(p -> p.getPrice() > 3000)
                .filter(p -> p.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted products: " + filteredProducts);

        Stream<Product> productStream = products.stream();
        Optional<String> mostPopularProductName = mostPopularName(productStream);
        System.out.println("Most popular product name: " + mostPopularProductName.orElse("No products"));
    }

    private static List<Product> createProductList() {
        List<Product> productList = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            productList.add(new Product("Manufacturer" + i, Category.PHONE,
                    LocalDate.now().minusDays(i * 10), i * 1000.0));
        }
        return productList;
    }

    static Optional<String> mostPopularName(Stream<Product> products) {
        // Placeholder implementation, you can replace it with your logic
        return Optional.of("PlaceholderProduct");
    }
}

