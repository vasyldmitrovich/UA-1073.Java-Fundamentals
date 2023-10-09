package com.softserve.edu05;
import java.util.Scanner;

public class hw22 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Введіть 10 цілих чисел");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = calc(numbers);
        System.out.println("Сума перших п'яти елементів " + sum);

        scanner.close();
    }

    public static int calc(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
