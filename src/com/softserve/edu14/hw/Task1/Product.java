package com.softserve.edu14.hw.Task1;

import java.time.LocalDate;
import java.util.*;

public class Product {
    private String manufactureCategory;
    private LocalDate dateOfManufacture;
    private int Price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, int price) {
        this.manufactureCategory = manufactureCategory;
        this.dateOfManufacture = dateOfManufacture;
        Price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", Price=" + Price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Price == product.Price && Objects.equals(manufactureCategory, product.manufactureCategory) && Objects.equals(dateOfManufacture, product.dateOfManufacture);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufactureCategory, dateOfManufacture, Price);
    }

    public static void filerAndSortedByPrice(List<Product> list) {
        list.stream()
                .filter(el -> LocalDate.now().getYear() - el.getDateOfManufacture().getYear() > 1)
                .filter(el -> el.getManufactureCategory() == "Phone")
                .sorted(Comparator.comparingDouble(el -> el.getPrice()))
                .forEach(System.out::println);
    }
    public static List<String> manufactureCategoryItem () {
       List <String> list =Arrays.asList(
               "Phone",
               "TV",
               "Fridge",
               "Laptop"
    );
       return list;
    }
    public static Product create20Products() {
        Random rnd = new Random();
        String manufactureCategory = manufactureCategoryItem().get(rnd.nextInt(manufactureCategoryItem().size()));
        LocalDate dateOfManufacture = LocalDate.of(rnd.nextInt(2005, 2023), rnd.nextInt(1,12), rnd.nextInt(1,30));
        int price = rnd.nextInt(0, 5000);
        return new Product(manufactureCategory, dateOfManufacture, price);
    }
    public static List <Product> createList () {
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
           list.add(i,create20Products());
        }
        return list;
    }
}
