package com.softserve.edu01.hw;

import java.util.Scanner;

public class Hw3 {

    public static void costOfCalls () {

        System.out.println("Hello please insert duration of the first " +
                "call in minutes");
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();
        System.out.println("insert cost of first call");
        int c1 = scanner.nextInt();
        System.out.println("insert duration of second call");
        int t2 = scanner.nextInt();
        System.out.println("insert cost of second call");
        int c2 = scanner.nextInt();
        System.out.println("insert duration of third call");
        int t3 = scanner.nextInt();
        System.out.println("insert cost of third call");
        int c3 = scanner.nextInt();
        System.out.println("The costs of the calls\\:" +
                "\n 1 call - " + t1 * c1 +
                "\n 2 call - " + t2 * c2 +
                "\n 3 call - " + t3 * c3 +
                "\n and the total cost - " +
                (t1 * c1 + t2 * c2 + t3 * c3));
    }
}
