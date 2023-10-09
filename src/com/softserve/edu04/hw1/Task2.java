package com.softserve.edu04.hw1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Input the second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Input the third number: ");
        int number3 = scanner.nextInt();

        int max;
        int min;

        //Do the same with this logic
        if (number1 < number2){
            min = number1;
        } else {
            min = number2;
        }
        if (number3 < min){
            min = number3;
        }

        if (number1 < number2){
            max = number2;
        } else {
            max  = number1;
        }
        if (number3 > max){
            max = number3;
        }
        System.out.println("The max number is: " + max);
        System.out.println("The min number is: " + min);
    }
}

