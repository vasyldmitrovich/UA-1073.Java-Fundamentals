package com.softserve.edu04.pt.task4;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Mouse", 120.50, 12);
        Product product2 = new Product("Iphone", 299.99, 50);
        Product product3 = new Product("Knife", 10, 100);
        Product product4 = new Product("Pizza", 15.99, 10);
        Product productMost = new Product("", 0, 0);


        if (productMost.getPrice()<product1.getPrice()) {
            productMost = product1;
        }
        if (productMost.getPrice()<product2.getPrice()) {
            productMost = product2;
        }
        if (productMost.getPrice()<product3.getPrice()) {
            productMost = product3;
        }
        if (productMost.getPrice()<product4.getPrice()) {
            productMost = product4;
        }
        System.out.println("Name and quantity of the most expensive item");
        System.out.println("Name: " + productMost.getName() + "     Quantity: " + productMost.getQuantity());

        if (productMost.getQuantity() < product1.getQuantity()) {
            productMost = product1;
        }
        if (productMost.getQuantity() < product2.getQuantity()) {
            productMost = product2;
        }
        if (productMost.getQuantity() < product3.getQuantity()) {
            productMost = product3;
        }
        if (productMost.getQuantity() < product4.getQuantity()) {
            productMost = product4;
        }
        System.out.println("Name of the items, which has the biggest quantity");
        System.out.println("Name: " + productMost.getName());
    }
}
