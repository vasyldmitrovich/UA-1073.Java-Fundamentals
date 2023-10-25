package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {//Ok
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Side 1: ");
        Double a = scanner.nextDouble();
        System.out.println("Input Side 2: ");
        Double b = scanner.nextDouble();
        System.out.println("Input Side 3: ");
        Double c = scanner.nextDouble();
        Double p = (a + b + c)/2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("The area of the triangle is %.2f".formatted(S));
    }
}
