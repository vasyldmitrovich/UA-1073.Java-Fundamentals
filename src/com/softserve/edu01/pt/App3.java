package com.softserve.edu01.pt;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

            System.out.printf("%d + %d = %d%n", a, b, a + b);
            System.out.printf("%d - %d = %d%n", a, b, a - b);
            System.out.printf("%d * %d = %d%n", a, b, a * b);
            System.out.printf("%d / %d = %g%n", a, b, a / (double) b);

        }
    }
