package com.softserve.edu03.hw;
import java.util.Scanner;
public class MathCalculate {

    public static void main(String[] args) {
        double firstNumber = getNumber("Enter the first number:");
        double secondNumber = getNumber("Enter the second number:");

        double total = getTotal(firstNumber, secondNumber);
        double average = getAverage(firstNumber, secondNumber);

        System.out.println("The sum of " + firstNumber + " and " + secondNumber + " is " + total);
        System.out.printf("The average of " + firstNumber + " and " + secondNumber + " is " + average);
    }
    public static double getNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static double getTotal(double number1, double number2) {
        return number1 + number2;
    }

    public static double getAverage(double number1, double number2) {
        return (number1 + number2) / 2.0;
    }
}
