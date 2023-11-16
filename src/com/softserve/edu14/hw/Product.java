package com.softserve.edu14.hw;

import java.time.LocalDate;
import java.util.Objects;

class Product {
    ManufactureCategory category;
    LocalDate manufactureDate;
    int price;

    public Product(ManufactureCategory category, int yearOfProduction, int monthOfProduction, int dayOfProduction, int price) {
        this.category = category;
        this.manufactureDate = LocalDate.of(yearOfProduction, monthOfProduction, dayOfProduction);
        this.price = price;
    }

    public ManufactureCategory getCategory() {
        return category;
    }

    public void setCategory(ManufactureCategory category) {
        this.category = category;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(int yearOfProduction, int monthOfProduction, int dayOfProduction) {
        this.manufactureDate = LocalDate.of(yearOfProduction, monthOfProduction, dayOfProduction);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return getPrice() == product.getPrice() &&
                getCategory() == product.getCategory() &&
                getManufactureDate().equals(product.getManufactureDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCategory(), getManufactureDate(), getPrice());
    }

    @Override
    public String toString() {
        return "Product{" +
                "category = " + getCategory() +
                ", manufactureDate = " + getManufactureDate() +
                ", price = " + getPrice() +
                '}';
    }
}
