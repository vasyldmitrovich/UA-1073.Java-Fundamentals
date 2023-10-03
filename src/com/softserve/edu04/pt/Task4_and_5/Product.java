package com.softserve.edu04.pt.Task4_and_5;

import java.util.Locale;
import java.util.Scanner;

import static com.softserve.edu03.pt.Task1.Main.SCANNER;

public class Product {
    private String name;
    private double prise;
    private int quantity;

    //constructors
    public Product(String name, double prise, int quantity) {
        this.name = name;
        this.prise = prise;
        this.quantity = quantity;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrise() {
        return prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //methods

    @Override
    public String toString() {
        return "Product " +
                "name '" + name + '\'' +
                ", prise= " + prise +
                ", quantity= " + quantity ;
    }

    static Product prompt() {
        System.out.println("Input name of product");
        String name = SCANNER.nextLine();
        System.out.println("Input name of price");
        double price = SCANNER.nextDouble();
        SCANNER.nextLine();
        System.out.println("Input name of quantity");
        int quantity = SCANNER.nextInt();
        SCANNER.nextLine();
        return new Product (name, price, quantity);
    }
    public static Product theMostExpensiveProduct (
            Product p1,
            Product p2,
            Product p3,
            Product p4
    ) {
        Product res = p1;
        if (p2.getPrise() > res.getPrise()) {
            res = p2;
        } if (p3.getPrise() > res.getPrise()) {
            res = p3;
        }
        if (p4.getPrise() > res.getPrise()) {
            res = p4;
        }
        return res;
    }
    public static Product theBiggestQuantity (
            Product p1,
            Product p2,
            Product p3,
            Product p4
    ) {
        Product res = p1;
        if (p2.getQuantity() > res.getQuantity()) {
            res = p2;
        } if (p3.getQuantity() > res.getQuantity()) {
            res = p3;
        }
        if (p4.getQuantity() > res.getQuantity()) {
            res = p4;
        }
        return res;
    }

}
