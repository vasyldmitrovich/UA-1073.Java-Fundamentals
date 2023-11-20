package com.softserve.edu14.hw.task1;

import java.time.LocalDate;

public class Product {
    private String categoryManufact;
    private LocalDate dateManufact;
    private int priceManufact;

    public Product(String categoryManufact, LocalDate dateManufact, int priceManufact) {
        this.categoryManufact = categoryManufact;
        this.dateManufact = dateManufact;
        this.priceManufact = priceManufact;
    }

    public String getCategoryManufact() {
        return categoryManufact;
    }

    public void setCategoryManufact(String categoryManufact) {
        this.categoryManufact = categoryManufact;
    }

    public LocalDate getDateManufact() {
        return dateManufact;
    }

    public void setDateManufact(LocalDate dateManufact) {
        this.dateManufact = dateManufact;
    }

    public int getPriceManufact() {
        return priceManufact;
    }

    public void setPriceManufact(int priceManufact) {
        this.priceManufact = priceManufact;
    }

    @Override
    public String toString() {
        return "Product{" +
                "categoryManufact='" + categoryManufact + '\'' +
                ", dateManufact=" + dateManufact +
                ", priceManufact=" + priceManufact +
                '}';
    }


}

