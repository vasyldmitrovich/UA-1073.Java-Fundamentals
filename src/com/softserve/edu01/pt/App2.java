package com.softserve.edu01.pt;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input first number");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Input second number");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Input second number");
        int number3 = Integer.parseInt(scanner.nextLine());

        double average = (number1 + number2 + number3) / 3.0;
        System.out.printf("Average is %.3f", average);
    }
}
