package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Input the third number: ");
        int num3 = scanner.nextInt();

        int min;

        if(num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        System.out.println("The smallest number is:" + min);
    }
}
