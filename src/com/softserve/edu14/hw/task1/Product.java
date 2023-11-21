package com.softserve.edu14.hw.task1;

import java.time.LocalDate;

public class Product {
    private String manufacturerCategory;
    private LocalDate dateOfManufacture;
    private int price;

    public Product(String manufacturerCategory, LocalDate dateOfManufacture, int price) {
        this.manufacturerCategory = manufacturerCategory;
        this.dateOfManufacture = dateOfManufacture;
        this.price = price;
    }

    public String getManufacturerCategory() {
        return manufacturerCategory;
    }

    public void setManufacturerCategory(String manufacturerCategory) {
        this.manufacturerCategory = manufacturerCategory;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "manufacturerCategory='" + manufacturerCategory + '\'' +
                ", dateOfManufacture=" + dateOfManufacture +
                ", price=" + price +
                '}';
    }
}