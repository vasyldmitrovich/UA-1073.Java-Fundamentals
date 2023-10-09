package com.softserve.edu05;
import java.util.Scanner;
public class hw13 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Введіть 5 цілих чисел ");
        for (int i = 0; i < 5; i++) numbers[i] = scanner.nextInt();

        //Move this logic to some method and call this method here
        int pos = -1, min = Integer.MAX_VALUE, minPos = -1, prod = 1, sum = 0, posCount = 0;

        for (int i = 0; i < 5; i++) {
            int num = numbers[i];
            if (num > 0) {
                posCount++;
                if (posCount == 2 && pos == -1) pos = i;
            }
            if (num < min) {
                min = num;
                minPos = i;
            }
            if (num % 2 == 0 && num != 0) prod *= num;
            if (i < 5) sum += num;
        }

        System.out.println("Позиція другого позитивного числа: " + (pos != -1 ? pos : "не знайдено"));
        System.out.println("Мінімальне значення в масиві: " + min);
        System.out.println("Позиція мінімального значення: " + minPos);
        System.out.println("Добуток всіх парних чисел (крім 0): " + prod);
        System.out.println("Сума перших п'яти елементів: " + sum);

        scanner.close();
    }
}
