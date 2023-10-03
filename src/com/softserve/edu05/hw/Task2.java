package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task2 {
    public static void task2() {
        String response = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter the first number: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter the second number: ");
            int b = Integer.parseInt(scanner.nextLine());

            System.out.printf("%d + %d = %d\n", a, b, (a + b));

            System.out.println("Are you want to continue?");
            response = scanner.nextLine();
        } while (response.toLowerCase().equals("yes"));

    }
}
