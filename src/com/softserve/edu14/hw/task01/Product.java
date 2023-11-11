package com.softserve.edu14.hw.task01;

import java.time.LocalDate;

public class Product {
    private String manufactureCategory;
    private LocalDate manufactureDate;
    private int price;

    public Product(String manufactureCategory, LocalDate manufactureDate, int price) {
        this.manufactureCategory = manufactureCategory;
        this.manufactureDate = manufactureDate;
        this.price = price;
    }

    public String getManufactureCategory() {
        return manufactureCategory;
    }

    public void setManufactureCategory(String manufactureCategory) {
        this.manufactureCategory = manufactureCategory;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format( "Manufacture category: %-8s Manufacture date: %10s   Price: %5d",
                manufactureCategory, manufactureDate, price);
    }
}
