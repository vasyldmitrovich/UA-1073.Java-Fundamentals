package com.softserve.edu01.pt;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Task_2 {
    public static void task2()  {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input firt number");
        int firt = scanner.nextInt();
        System.out.println("Input second number");
        int second = scanner.nextInt();
        System.out.println("Input third number");
        int third = scanner.nextInt();
        double result = (firt + second + third)/ 3.0;
        System.out.printf("Avarage is %f%n", result);
    }
}
