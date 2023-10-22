package com.softserve.edu05.hw.Task2;

import java.util.Scanner;

public class Numbers {//This is nice
    static Scanner SCANNER = new Scanner(System.in);
    static int[] numbers = new int[2];
    static int answer;
    static int count = 0;
    public static int[] inputTwoNumbers () {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Input number");
            numbers[i] = SCANNER.nextInt();
            SCANNER.nextLine();
        }
        return numbers;
    }
    public static int countSum (int[] numbers) {
        count = 0;
        for (int i = 0; i < numbers.length; i++) {
            count += numbers[i];
        }
        return count;

    }

    public static void askIfWantToRepeat () {
        System.out.println("Do you want to perform the operation again? Input 1 to repeat, or 0 to exit");
        answer = SCANNER.nextInt();
    }

    public static void countSumOfNumbers () {
        do { inputTwoNumbers();
            countSum(numbers);
            outputResult();
            askIfWantToRepeat();

    } while (answer == 1);}

    public static void outputResult () {
        System.out.println("The sum of this numbers: " + count);
    }
}
