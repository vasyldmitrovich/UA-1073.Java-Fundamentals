package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть номер місяця: ");
        int month = scanner.nextInt();

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month >= 1 && month <= 12) {
            int days = daysInMonth[month - 1];
            System.out.println("Кількість днів у місяці:" + days);
        } else {
            System.out.println("Некорректний номер місяця");
        }
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        int product = 1;
        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0 && positiveCount < 5) {
                int[] number = new int[0];
                sum += number[i];
                positiveCount++;
            } else if (numbers[i] < 0 && negativeCount < 5) {
                product *= numbers[i];
                negativeCount++;
            }
        }
        if (positiveCount == 5) {
            System.out.println("Сума перших п'яти додатних чисел:" + sum);
        } else {
            System.out.println("Добуток останніх п'яти від'ємних чисел:" + product);
        }
        int[] numbers2 = {1, 3, 5, -7, 8};
        int secondPositiveIndex = -1;
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < numbers2.length; i++) {
            if (numbers2[i] > 0) {
                if (secondPositiveIndex == -1) {
                    secondPositiveIndex = i;
                }
            }

            if (numbers2[i] < min) {
                min = numbers2[i];
                minIndex = i;
            }
        }

        System.out.println("Положення другого додатного числа: " + secondPositiveIndex);

        if (minIndex != -1) {
            System.out.println("Мінімальне значення в масиві: " + min);
            System.out.println("Положення мінімального значення: " + minIndex);
        }

        // Обчислення добутку усіх введених парних чисел (виключаючи 0)
        System.out.print("Введіть 5 цілих чисел: ");
        int productEven = 1;
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            if (num != 0 && num % 2 == 0) {
                productEven *= num;
            }
        }

        System.out.println("Добуток усіх введених парних чисел (крім 0): " + productEven);
    }
    }  
