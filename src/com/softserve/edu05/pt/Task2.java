package com.softserve.edu05.pt;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число:");
        int number = scanner.nextInt();
        boolean isPrime = checkPrime(number);
        if (isPrime) {
            System.out.println("Є простим числом");
        } else {
            System.out.println("Не є простим числом");
        }
    }
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i+2) == 0) {
                return false;
            }
        }
        return true;
    }


}
