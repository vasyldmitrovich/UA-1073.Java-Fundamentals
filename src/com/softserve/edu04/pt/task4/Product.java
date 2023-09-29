package com.softserve.edu04.pt.task4;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    static Product mostExpensiveProduct(
            Product p1,
            Product p2,
            Product p3,
            Product p4
    ) {
        Product res = p1;
        res = maxByPrice(res, p2);
        res = maxByPrice(res, p3);
        res = maxByPrice(res, p4);
        return res;

    }

    static Product maxByPrice(Product p1, Product p2) {
        return p1.getPrice() >= p2.getPrice() ? p1 : p2;
    }

    static Product mostQuantity(
            Product p1,
            Product p2,
            Product p3,
            Product p4
    ) {
        Product res = p1;
        res = maxQuentity(res, p2);
        res = maxQuentity(res, p3);
        res = maxQuentity(res, p4);
        return res;

    }

    static Product maxQuentity(Product p1, Product p2) {
        return p1.getQuantity() >= p2.getQuantity() ? p1 : p2;


    }
}
