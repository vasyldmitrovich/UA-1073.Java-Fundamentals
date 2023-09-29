package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task5 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main() {
        Task4.Product product1 = new Task4.Product();
        Task4.Product.promptParameters(product1);
        Task4.Product product2 = new Task4.Product();
        Task4.Product.promptParameters(product2);
        Task4.Product product3 = new Task4.Product();
        Task4.Product.promptParameters(product3);

        System.out.println(
                "Task4.Product which has biggest price is: "
                        + "'" + Task4.Product.nameBiggestPrice + "'"
                        + " which cost: " + Task4.Product.biggestPrice + "."
        );
        System.out.println("Task4.Product which has the biggest quantity is: "
                + "'" + Task4.Product.nameTotalQuantity + "'"
                + " which quantity is " + Task4.Product.totalQuantity + "."
        );
    }
}


