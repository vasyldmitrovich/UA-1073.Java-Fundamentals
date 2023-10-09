package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        float a = scanner.nextFloat();
        System.out.println("Input second number: ");
        float b = scanner.nextFloat();
        System.out.println("Input third number: ");
        float c = scanner.nextFloat();
        float result = (a + b + c) / 3;
        System.out.println("Average is: " + result);
    }
}
