package com.softserve.edu04.hw.task2;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число");
        int num1 = scanner.nextInt();
        System.out.println("Введіть друге число");
        int num2 = scanner.nextInt();
        System.out.println("Введіть третє число");
        int num3 = scanner.nextInt();

        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);

        System.out.println("Максимальне значення: " + max);
        System.out.println("Мінімальне значення: " + min);

    }
}
