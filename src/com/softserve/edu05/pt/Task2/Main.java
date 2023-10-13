package com.softserve.edu05.pt.Task2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n = scanner.nextInt();
        System.out.println(isPrime(n));

    }

    static boolean isPrime (int n) {
        for (int i = 2; i <= n/2 ; i++) {
            if (n % i == 0 ) {
                System.out.println("Is not prime number");
                return false;
            }
        }
        System.out.println("Is a prime number");
        return true;
    }



}
