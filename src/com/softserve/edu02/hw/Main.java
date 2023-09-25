package com.softserve.edu02.hw;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println(" Ведіть радіус");
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double result = (int) ( 2 * radius * Math.PI );
        System.out.println("Результат :"+result);

    }
}