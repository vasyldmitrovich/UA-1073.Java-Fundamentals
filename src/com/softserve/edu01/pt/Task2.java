package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your first number");
        int number1 = scanner.nextInt();
        System.out.println("Input your second number");
        int number2 = scanner.nextInt();
        System.out.println("Input your third number");
        int number3 = scanner.nextInt();
        double average = (number1 + number2 + number3) / 3d;
        System.out.print("Average is " + average);
    }
}
