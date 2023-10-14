package com.softserve.edu01.pt;

import java.util.Scanner;

public class Pt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        double firstNumber = scanner.nextDouble();
        System.out.println("Enter the second number:");
        double secondNumber = scanner.nextDouble();
        System.out.println("Enter the third number:");
        double thirdNumber = scanner.nextDouble();
        double average = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("The average of the three numbers is: " + average);
    }
}

