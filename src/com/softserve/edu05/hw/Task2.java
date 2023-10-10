package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        String answer;

        do {
            System.out.println("Input first number:");
            int n1 = scanner.nextInt();
            System.out.println("Input second number:");
            int n2 = scanner.nextInt();
            int sum = sumOfNum(n1, n2);
            System.out.println(n1 + " + " + n2 + " = " + sum);
            scanner.nextLine();
            System.out.println("Do you want continue? Input answer \"Yes\" or \"No\"");
            answer = scanner.nextLine();
        } while (answer.equalsIgnoreCase("Yes"));

        System.out.println("You chose no.");
    }

    public static int sumOfNum(int n1, int n2) {
        return n1 + n2;
    }

}
