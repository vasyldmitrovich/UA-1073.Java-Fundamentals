package com.softserve.edu03.hw.task2;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.print("Input the first number: ");
        double firstNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Input the second number: ");
        double secondNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Input the third number: ");
        double thirdNumber = scanner.nextDouble();
        scanner.nextLine();

        System.out.printf("The smallest number is %.0f", findSmallestNumber(firstNumber, secondNumber, thirdNumber));
    }

    public static double findSmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {
        double[] nums = new double[]{firstNumber, secondNumber, thirdNumber};
        return Arrays.stream(nums).min().getAsDouble();
    }
}
