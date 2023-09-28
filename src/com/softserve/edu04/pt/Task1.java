package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();

        int oddCount = countOddNumbers(firstNumber, secondNumber, thirdNumber); // Викликаємо функцію тут

        System.out.println("Number of odd numbers: " + oddCount);

        scanner.close();
    }

    private static int countOddNumbers(int firstNumber, int secondNumber, int thirdNumber) { // Правильні назви параметрів
        int oddCount = 0;

        if (firstNumber % 2 != 0) {
            oddCount++;
        }

        if (secondNumber % 2 != 0) {
            oddCount++;
        }

        if (thirdNumber % 2 != 0) {
            oddCount++;
        }

        return oddCount;
    }
}
