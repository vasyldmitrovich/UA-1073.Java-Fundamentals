package com.softserve.edu04.pt;

public class Task4_5 {
    public static void task4_5() {

        Product p1 = new Product("Pen", 0.1, 354);
        Product p2 = new Product("Pencil", 0.05, 548);
        Product p3 = new Product("Scissors", 3, 87);
        Product p4 = new Product("Rubber", 1.3, 124);

        System.out.println("The most expensive item is " + getMostExpensiveItem(p1, p2, p3, p4).getName() + ".");
        System.out.println("The biggest item quantity is " + getTheBiggestQuantity(p1, p2, p3, p4).getName() + ".");
    }

    public static Product getMostExpensiveItem(Product p1, Product p2, Product p3, Product p4) {

        Product mostExpensive = p1;

        if (mostExpensive.getPrice() < p2.getPrice()) {
            mostExpensive = p2;
        }
        if (mostExpensive.getPrice() < p3.getPrice()) {
            mostExpensive = p3;
        }
        if (mostExpensive.getPrice() < p4.getPrice()) {
            mostExpensive = p4;
        }

        return mostExpensive;
    }

    public static Product getTheBiggestQuantity(Product p1, Product p2, Product p3, Product p4) {

        Product mostExpensive = p1;

        if (mostExpensive.getQuantity() < p2.getQuantity()) {
            mostExpensive = p2;
        }
        if (mostExpensive.getQuantity() < p3.getQuantity()) {
            mostExpensive = p3;
        }
        if (mostExpensive.getQuantity() < p4.getQuantity()) {
            mostExpensive = p4;
        }

        return mostExpensive;
    }
}

