package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input first number:");
        int num1 = scanner.nextInt();
        System.out.println("Input second number:");
        int num2 = scanner.nextInt();
        System.out.println("Input third number:");
        int num3 = scanner.nextInt();

       findNum(num1, num2, num3);

        //Move this logic to some method and call this method here

    }
    public static void findNum(int number1, int number2, int number3) {
        int min = -5;
        int max = 5;
        if (number1 >= min && number1 <= max) {
            System.out.println("First number is belong to range [-5, 5].");
        } else {
            System.out.println("First number is NOT belong to range [-5, 5].");
        }

        if (number2 >= min && number2 <= max) {
            System.out.println("Second number is belong to range [-5, 5].");
        } else {
            System.out.println("Second number is NOT belong to range [-5, 5].");
        }

        if (number3 >= min && number3 <= max) {
            System.out.println("Third number is belong to range [-5, 5].");
        } else {
            System.out.println("Third number is NOT belong to range [-5, 5].");
        }
    }
}
