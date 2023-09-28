package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();

        int smallestNumber = findSmallestNumber(firstNumber, secondNumber, thirdNumber);
        int biggestNumber = findBiggestNumber(firstNumber, secondNumber, thirdNumber);

        System.out.println("Minimum value is " + smallestNumber);
        System.out.println("Maximum value is " + biggestNumber);
    }

    public static int findSmallestNumber(int a, int b, int c) {
        int smallest = a;

        if (b < smallest) {
            smallest = b;
        }

        if (c < smallest) {
            smallest = c;
        }

        return smallest;
    }

    public static int findBiggestNumber(int a, int b, int c) {
        int biggest = a;

        if (b > biggest) {
            biggest = b;
        }

        if (c > biggest) {
            biggest = c;
        }

        return biggest;
    }
}

