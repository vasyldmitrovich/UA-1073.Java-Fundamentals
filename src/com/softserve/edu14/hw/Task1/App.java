package com.softserve.edu14.hw.Task1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        String[][] productDetails = {
                {"Manufacturer1", "Laptop", "2022-01-01", "1500.0"},
                {"Manufacturer2", "Phone", "2021-05-10", "3000.0"},
                {"Manufacturer3", "Backpack", "2022-08-20", "50.0"},
                {"Manufacturer4", "Phone", "2021-03-15", "3050.0"},
                {"Manufacturer5", "Sunglasses", "2022-06-05", "30.0"},
                {"Manufacturer6", "Coffee Mug", "2022-09-12", "15.0"},
                {"Manufacturer7", "Phone", "2021-07-08", "25.0"},
                {"Manufacturer8", "Phone", "2021-11-30", "4000.0"},
                {"Manufacturer9", "Phone", "2022-02-25", "70000.0"},
                {"Manufacturer10", "Watch", "2021-12-18", "200.0"},
                {"Manufacturer11", "Phone", "2022-04-03", "4000.0"},
                {"Manufacturer12", "Phone", "2022-07-22", "45000.0"},
                {"Manufacturer13", "Keyboard", "2021-10-14", "60.0"},
                {"Manufacturer14", "Mouse", "2022-03-08", "25.0"},
                {"Manufacturer15", "Phone", "2022-05-17", "20.0"},
                {"Manufacturer16", "Phone", "2021-06-28", "300.0"},
                {"Manufacturer17", "Book", "2022-08-07", "15.0"},
                {"Manufacturer18", "Phone", "2021-02-11", "5.0"},
                {"Manufacturer19", "Phone", "2022-10-09", "18.0"},
                {"Manufacturer20", "Phone", "2021-04-26", "80.0"}
        };

        for (String[] details : productDetails) {
            productList.add(new Product(details[0], details[1], LocalDate.parse(details[2]), Double.parseDouble(details[3])));
        }

        List<Product> filteredAndSortedProducts = productList.stream()
                .filter(product -> product.getCategory().equals("Phone") &&
                        product.getPrice() > 3000 &&
                        product.getDateOfManufacture().isBefore(LocalDate.now().minusYears(1)))
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());

        filteredAndSortedProducts.forEach(product -> System.out.println(
                "Manufacturer: " + product.getManufacture() +
                        ", Category: " + product.getCategory() +
                        ", Date of Manufacture: " + product.getDateOfManufacture() +
                        ", Price: " + product.getPrice()
        ));

    }
}