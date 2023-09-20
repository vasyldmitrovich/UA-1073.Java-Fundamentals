package com.softserve.edu01.pt;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
// Завдання 3
        Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть перше число і натисніть -Enter-");
        double a = scan.nextDouble();

        System.out.println("Введіть друге число і натисніть -Enter-");
        double b = scan.nextDouble();

        System.out.println("Результат для дії " + '+' + " = " + (a + b));
        System.out.println("Результат для дії " + '-' + " = " + (a - b));
        System.out.println("Результат для дії " + '*' + " = " + (a * b));
        System.out.println("Результат для дії " + '/' + " = " + (a / b));


    }
}
