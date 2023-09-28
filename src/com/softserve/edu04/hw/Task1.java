package com.softserve.edu04.hw;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Input the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Input the third number: ");
        double thirdNumber = scanner.nextDouble();

        boolean allInRange = isInRange(firstNumber) && isInRange(secondNumber) && isInRange(thirdNumber);

        if (allInRange) {
            System.out.println("ALL Numbers belong to the interval [-5, 5]");
        } else {
            System.out.println("NOT ALL Numbers belong to the interval [-5, 5]");
        }

        scanner.close();
    }

    private static boolean isInRange(double number) {
        return number >= -5 && number <= 5;
    }
}

