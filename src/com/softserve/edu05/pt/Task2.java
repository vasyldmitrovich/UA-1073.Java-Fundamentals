package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your integer: ");
        int yourInteger = scanner.nextInt();
        for (int i = 2; i < yourInteger / 2; i++) {
            if (yourInteger % i == 0) {
                System.out.println(yourInteger + " Is not prime number");
                return;

            }
        }
        System.out.println(yourInteger + " Is a prime number");

    }
}
