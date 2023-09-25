package com.softserve.edu03.hw;
import java.util.Scanner;
public class Task2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input the second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Input the third number: ");
        int thirdNumber = scanner.nextInt();

        int smallestNumber = findSmallestNumber(firstNumber, secondNumber, thirdNumber);

        System.out.println("The smallest number is " + smallestNumber);
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
}

