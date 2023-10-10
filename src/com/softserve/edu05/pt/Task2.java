package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number which need to check:");
        int num = scanner.nextInt();

        if (checkNumb(num)) {
            System.out.println(num + " number is \"prime number\".");
        } else {
            System.out.println(num + " number isn`t \"prime number\".");
        }

    }

    public static boolean checkNumb (int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        } return true;
    }
}
