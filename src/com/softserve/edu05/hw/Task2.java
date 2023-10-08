package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        int answer;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input 2 numbers: ");
            int[] numbers = new int[2];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = scanner.nextInt();

            }
            int sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += numbers[i];

            }
            System.out.println("Sum = " + sum);

            System.out.println("Would you like to repeat the operation again?");
            answer = scanner.nextInt();


        } while (answer == 1);


    }
}
