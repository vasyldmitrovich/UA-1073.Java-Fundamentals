package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number:");
        int number1 = scanner.nextInt();
        System.out.println("Input the second number:");
        int number2 = scanner.nextInt();
        System.out.println("Input the third number:");
        int number3 = scanner.nextInt();

        int min;

        if (number1 < number2){
            min = number1;
        } else {
            min = number2;
        }

        if (number3 < min) {
            min = number3;
        }

        System.out.println("The smallest number is: " + min);

    }
}
