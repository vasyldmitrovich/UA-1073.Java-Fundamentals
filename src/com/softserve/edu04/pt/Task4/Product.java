package com.softserve.edu04.pt.Task4;

import java.util.Scanner;

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

    public void prodValues (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        System.out.println("Enter quantity: ");
        int quantity = sc.nextInt();
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }
}
