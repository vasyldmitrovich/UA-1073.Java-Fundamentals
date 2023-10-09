package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int first = scanner.nextInt();
        System.out.println("Input second number: ");
        int second = scanner.nextInt();
        int result1 = first + second;
        int result2 = first - second;
        int result3 = first * second;
        int result4 = first / second;
        System.out.println("You result: " + first + " + " + second + " = " + result1);
        System.out.println(first + " - " + second + " = " + result2);
        System.out.println(first + " * " + second + " = " + result3);
        System.out.println(first + "/" + second + " = " + result4);
    }
}
