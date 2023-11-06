package com.softserve.edu14.hw.task1;

import java.time.LocalDate;

public class Product {
    private Category manufactureCategory;
    private LocalDate dateOfManufacture;
    private double price;

    public Product(String manufactureCategory, LocalDate dateOfManufacture, double price) {
        this.manufactureCategory = Category.valueOf(manufactureCategory.toUpperCase());
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufactureCategory='" + manufactureCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }

    public String getManufactureCategory() {
        return manufactureCategory.category;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = Category.valueOf(manufactureCategory);
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
