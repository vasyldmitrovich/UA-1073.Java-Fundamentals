package com.softserve.edu05.pt.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Input namber: ");
        int nam = scanner.nextInt();
        if (isPrime(nam) == true){
            System.out.println(nam + " is a prime number");
        }else System.out.println(nam + " isnt a prime number");

    }
    static boolean isPrime (int n){
        for (int i = 2; i <= n/2 ; i++) {
            if (n%i == 0) return false;
        }
        return true;
    }
}
