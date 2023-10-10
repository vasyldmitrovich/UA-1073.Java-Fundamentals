package com.softserve.edu04.hw;

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

        System.out.println("The smallest number is: " + findMin(number1, number2, number3));
        System.out.println("The biggest number is: " + findMax(number1, number2, number3));


        //Do the same there

    }
    public static int findMin(int number1, int number2, int number3) {
        int min = 0;
        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        return min;
    }
    public static int findMax(int number1, int number2, int number3) {
        int max = 0;
        if (number1 < number2) {
            max = number2;
        } else {
            max = number1;
        }
        if (number3 > max) {
            max = number3;
        }
        return max;
    }

}
