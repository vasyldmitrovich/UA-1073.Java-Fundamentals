package com.softserve.edu05.pt;

import static com.softserve.edu05.pt.App.SCANNER;

public class PrimeNumber {
    public static int promptNumber() {
        int num = 0;

        do {
            System.out.println("Enter positive number");
            num = SCANNER.nextInt();
            SCANNER.nextLine();
        } while(num <= 0);

        return num;
    }
    public static boolean isPrime(int num ) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
