package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 numbers: ");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int secondPositivePosition = -1;
        int minimumValue = numbers[0];
        int minimumPosition = 0;
        int productOfEvenNumbers = 1;
        for (int i = 0; i < 5; i++) {
            if (numbers[i] > 0) {
                if (secondPositivePosition == -1) {
                    secondPositivePosition = i;
                }
            }
            if (numbers[i] < minimumValue) {
                minimumValue = numbers[i];
                minimumPosition = i;
            }
            if (numbers[i] % 2 == 0 && numbers[i] != 0) {
                productOfEvenNumbers *= numbers[i];
            }
        }
        if (secondPositivePosition == -1) {
            System.out.println("No second positive number found.");
        } else {
            System.out.println("Position of the second positive number: " + secondPositivePosition);
        }
        System.out.println("Minimum value: " + minimumValue);
        System.out.println("Position of minimum value: " + minimumPosition);
        if (productOfEvenNumbers == 1) {
            System.out.println("No even numbers found to calculate the product.");
        } else {
            System.out.println("Product of even numbers (excluding 0): " + productOfEvenNumbers);
        }
    }


}

