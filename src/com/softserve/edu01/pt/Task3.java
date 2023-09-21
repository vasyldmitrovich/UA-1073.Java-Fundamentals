package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int plus = a+b;
        int min = a-b;
        int mnog = a*b;
        int del = a/b;

        System.out.println(plus);
        System.out.println(min);
        System.out.println(mnog);
        System.out.println(del);

    }
}
