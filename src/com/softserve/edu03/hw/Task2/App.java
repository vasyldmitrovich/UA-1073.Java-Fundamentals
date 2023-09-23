package com.softserve.edu03.hw.Task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Formula min = new Formula();

        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();

        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Input third number: ");
        int num3 = scanner.nextInt();

        int minNum = min.minimum(num1, num2, num3);
        System.out.println("Smallest number: " + minNum);
    }
}
