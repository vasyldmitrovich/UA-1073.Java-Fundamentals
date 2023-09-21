package com.softserve.edu01.pt;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input first number:");
        int a = console.nextInt();
        System.out.println("Input second number:");
        int b = console.nextInt();
        System.out.println("Input third number:");
        int c = console.nextInt();
        double average = (a + b + c) / 3.0;
        System.out.printf("Average is %.7f", average);
    }
}
