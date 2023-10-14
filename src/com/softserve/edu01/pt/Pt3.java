package com.softserve.edu01.pt;

import java.util.Scanner;

public class Pt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            double division = (double) a / b;
            System.out.println("a + b = " + sum);
            System.out.println("a - b = " + difference);
            System.out.println("a * b = " + product);
            System.out.println("a / b = " + division);
        }
    }
}

