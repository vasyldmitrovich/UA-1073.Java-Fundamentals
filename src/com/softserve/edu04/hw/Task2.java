package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три цілі числа:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int min = Math.min(Math.min(number1, number2), number3);
        int max = Math.max(Math.max(number1, number2), number3);

        System.out.println("Мінімальне значення:" + min);
        System.out.println("Максимальне значення:" + max);

        scanner.close();

    }
}