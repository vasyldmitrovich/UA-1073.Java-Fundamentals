package com.softserve.edu01.pt;

import java.util.Scanner;

class Task3 {

    static void twoIntegers () {
        System.out.println("\nHello. Please insert variable \"a\"");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("please insert variable \"b\"");
        int b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + a * b);
        System.out.println("a / b = " + a / b);
    }
}
