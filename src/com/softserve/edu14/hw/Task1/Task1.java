package com.softserve.edu14.hw.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        // list of 20 Product objects
        List<Product> productList = new ArrayList<>();

        productList.add(new Product("Phone", LocalDate.now().minusMonths(6), 4000.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(2), 3500.0));
        productList.add(new Product("Laptop", LocalDate.now().minusMonths(9), 2500.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(5), 3200.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(15), 2800.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(25), 3500.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(35), 3000.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(45), 3800.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(55), 3100.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(65), 3400.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(75), 3200.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(85), 3600.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(95), 3300.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(105), 3100.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(115), 3700.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(125), 3400.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(135), 3200.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(145), 3800.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(155), 3500.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(165), 3300.0));
        productList.add(new Product("Phone", LocalDate.now().minusYears(1).minusDays(175), 3100.0));


        List<Product> filteredAndSortedProducts = Product.filterAndSortProducts(productList);

        System.out.println("Filtered and Sorted Products:");
        filteredAndSortedProducts.forEach(product -> System.out.println(
                product.getManufactureCategory() + ", " +
                        product.getDateOfManufacture() + ", " +
                        product.getPrice()));

        Optional<String> mostPopularName = Product.mostPopularName(productList.stream());

        System.out.println("Most Popular Name: " + mostPopularName.orElse("No name found"));
    }
}
