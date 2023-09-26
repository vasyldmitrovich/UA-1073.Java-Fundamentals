package com.softserve.edu04.pt;

import java.sql.SQLOutput;

public class Task45 {
    public static void run() {
        Product product1 = new Product();
        product1.promptValues();
        Product product2 = new Product();
        product2.promptValues();
        Product mostExpensive = (product1.getPrice() > product2.getPrice()) ? product1 : product2;
        int maxQuantity = (product1.getQuantity() > product2.getQuantity()) ? product1.getQuantity() : product2.getQuantity();
        Product product3 = new Product();
        product3.promptValues();
        mostExpensive = (product3.getPrice() > mostExpensive.getPrice()) ? product3 : mostExpensive;
        maxQuantity = (product3.getQuantity() > maxQuantity) ? product3.getQuantity() : maxQuantity;
        Product product4 = new Product();
        product4.promptValues();
        mostExpensive = (product4.getPrice() > mostExpensive.getPrice()) ? product4 : mostExpensive;
        maxQuantity = (product4.getQuantity() > maxQuantity) ? product4.getQuantity() : maxQuantity;
        System.out.println("Most expensive product is " + mostExpensive.getName() + ", quantity is " + mostExpensive.getQuantity());
        System.out.println("Products with maximal quantity:");
        if (product1.getQuantity() == maxQuantity) System.out.println(product1.getName());
        if (product2.getQuantity() == maxQuantity) System.out.println(product2.getName());
        if (product3.getQuantity() == maxQuantity) System.out.println(product3.getName());
        if (product4.getQuantity() == maxQuantity) System.out.println(product4.getName());
    }
}
