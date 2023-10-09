package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input side 1: ");
        double number1 = scanner.nextDouble();
        System.out.println("Input side 2: ");
        double number2 = scanner.nextDouble();
        System.out.println("Input side 3: ");
        double number3 = scanner.nextDouble();

        //Ok
        double p = (number1 + number2 + number3) / 2;
        double area = Math.sqrt( p * (p - number1) * (p - number2) * (p - number3));

        System.out.println("The area of triangle: " + area);

    }
}
