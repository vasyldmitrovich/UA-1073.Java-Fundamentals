package com.softserve.edu05.hw;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            char repeat;

            do {
                System.out.print("Введіть перше число: ");
                double num1 = scanner.nextDouble();

                System.out.print("Введіть друге число: ");
                double num2 = scanner.nextDouble();

                double sum = num1 + num2;
                System.out.println("Сума чисел: " + sum);

                System.out.print("Бажаєте виконати операцію знову? (Так/Ні): ");
                repeat = scanner.next().charAt(0);

            } while (Character.toLowerCase(repeat) == 'т');

            System.out.println("Дякуємо за користування програмою.");
        }

}
