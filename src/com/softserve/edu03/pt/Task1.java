package com.softserve.edu03.pt;

import java.util.Scanner;

class Task1 {//Nice

    static void getTotal (Integer a, Integer b) {
         System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
    }

    static void getAverage (Integer a, Integer b) {
        System.out.println("The average of " + a + " and " + b + " is " + (a + b) / 2.0);
    }

    static void getNumber() {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = scanner.nextInt();
        System.out.println("Enter the second number:");
        b = scanner.nextInt();
        getTotal(a, b);
        getAverage(a, b);
    }
}
