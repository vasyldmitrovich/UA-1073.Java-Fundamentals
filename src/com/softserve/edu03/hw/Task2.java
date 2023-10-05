package com.softserve.edu03.hw;

import java.util.Scanner;

   class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three integers from the user
        System.out.print("Введіть перше число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введіть третє число: ");
        int num3 = scanner.nextInt();

        // Find the smallest number
        int smallest = findSmallestNumber(num1, num2, num3);

        // Display the result
        System.out.println("Найменше число: " + smallest);

        // Close the scanner
        scanner.close();
    }

    // Method to find the smallest number among three integers
    private static int findSmallestNumber(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }
}