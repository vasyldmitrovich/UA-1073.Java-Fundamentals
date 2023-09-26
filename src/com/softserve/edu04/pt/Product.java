package com.softserve.edu04.pt;

import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product() {
        this("N/A", 0.0, 0);
    }

    public Product(String name) {
        this(name, 0.0, 0);
    }

    public Product(String name, double price) {
        this(name, price, 0);
    }

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

    public void promptValues() {
        Scanner console = new Scanner(System.in);
        System.out.print("Product name: ");
        String name = console.nextLine();
        System.out.print("Product price: ");
        double price = console.nextDouble();
        System.out.print("Product quantity: ");
        int quantity = console.nextInt();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
}
