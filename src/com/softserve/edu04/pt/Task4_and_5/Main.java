package com.softserve.edu04.pt.Task4_and_5;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Product product1 = Product.prompt();
        Product product2 = Product.prompt();
        Product product3 = Product.prompt();
        Product product4 = Product.prompt();
        Product theMostExpensive = Product.theMostExpensiveProduct(product1, product2, product3, product4);
        Product theBiggestQuantity = Product.theBiggestQuantity(product1, product2, product3, product4);
        System.out.println("The most expensive product is " + theMostExpensive);
        System.out.println("The biggest quantity is " + theBiggestQuantity);

         }
}
