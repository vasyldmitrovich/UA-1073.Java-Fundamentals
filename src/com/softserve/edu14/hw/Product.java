package com.softserve.edu14.hw;

import java.time.LocalDate;

public class Product {

    private String category;
    private LocalDate productionDate;
    private double price;

    public Product(String category, LocalDate productionDate, double price) {
        this.category = category;
        this.productionDate = productionDate;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "category='" + category + '\'' +
                ", productionDate=" + productionDate +
                ", price=" + price +
                '}';
    }
}