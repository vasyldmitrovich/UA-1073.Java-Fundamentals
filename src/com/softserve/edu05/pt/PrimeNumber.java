package com.softserve.edu05.pt;

import java.util.Scanner;

public class PrimeNumber {

    static void primeCheck() {
        System.out.println("Hello. Please, input POSITIVE INTEGER amd i will tell you is it a prime or not:");
        int sc = new Scanner(System.in).nextInt();
        if (sc <= 1) System.out.println("Is not prime number");
        for (int i = 2; i < sc; i++) {
            if (sc % i == 0) {
                System.out.println("Is not prime number");
            } else {
                System.out.println("Is a prime number");
            }
        }


    }


}
