package com.softserve.edu14.hw.task1;

import java.time.LocalDate;

public record Product(ManufactureCategory category, LocalDate date, double price) {

    @Override
    public String toString() {
        return "Product{" +
                "category=" + category +
                ", date=" + date +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(price, product.price) != 0) return false;
        if (category != product.category) return false;
        return date.equals(product.date);
    }

}
