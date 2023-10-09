package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    public static void main() {//Good
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Side 1: ");
        double number1 = scanner.nextDouble();
        System.out.println("Input Side 2: ");
        double number2 = scanner.nextDouble();
        System.out.println("Input Side 3: ");
        double number3 = scanner.nextDouble();

        double p = (number1 + number2 + number3) / 2;

        double area = Math.sqrt(p * (p - number1) * (p - number2) * (p - number3));//Move this logic to some method, and call this method here

        System.out.println("The area of the tringle is: " + area);
    }

}
