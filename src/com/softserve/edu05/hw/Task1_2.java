package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);
        int product = 1;

        for (int i = 5; i < 10; i++) {
            if (numbers[i] > 0) {
                product = product * numbers[i];
            }
        }
        System.out.println("Product = " + product);

    }
}
