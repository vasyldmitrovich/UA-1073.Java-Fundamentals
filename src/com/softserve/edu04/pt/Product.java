package com.softserve.edu04.pt;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price + ", Quantity: " + quantity;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Apple", 10.30, 2);
        Product product2 = new Product("Apple", 26.30, 2);
        Product product3 = new Product("Apple", 25.30, 2);
        Product product4 = new Product("Apple", 24.30, 2);
        System.out.println(product1);

    }

    static Product mostexp(Product product1,Product product2, Product product3, Product product4) {
            Product res = product1;
            if (product2.getPrice() > res.getPrice()) {
                res = product2;
            } if (product3.getPrice() > res.getPrice()) {
                res = product3;
        }   if (product4.getPrice() > res.getPrice()) {
                res = product4;
        }
        return null;
    }
}


