package com.softserve.edu05.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        calculateSum();
    }

    private static void calculateSum() {
        Scanner scanner = new Scanner(System.in);

        boolean choice = true;


        do {
            System.out.println("Enter 2 numbers");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            System.out.println("Sum: " + sum(num1, num2));

            System.out.println("Type Yes, if you want to continue else No");
            String answer = scanner.next();

            if (answer.equalsIgnoreCase("No")) {
                choice = false;
            }
            scanner.nextLine();
        } while (choice);//Good
    }
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
