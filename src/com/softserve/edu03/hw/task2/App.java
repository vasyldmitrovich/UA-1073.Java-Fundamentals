package com.softserve.edu03.hw.task2;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static final Scanner scanner = new Scanner(System.in);

    //All is good, but do the same what with task1 move code from this main method to edu03.hw.App.java
    //When you do that you will have one main method where you call all yours tasks
    public static void main(String[] args) {
        try {
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
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid data!");
        }



    }

    public static double findSmallestNumber(double firstNumber, double secondNumber, double thirdNumber) {
        double[] nums = new double[]{firstNumber, secondNumber, thirdNumber};
        return Arrays.stream(nums).min().getAsDouble();
    }
}
