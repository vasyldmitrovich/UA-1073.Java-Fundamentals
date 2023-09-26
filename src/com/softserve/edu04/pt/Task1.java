package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {
    public static void run() {
        Scanner console = new Scanner(System.in);
        int number1 = console.nextInt();
        int number2 = console.nextInt();
        int number3 = console.nextInt();
        int counter = 0;
        if (number1 % 2 != 0) counter++;
        if (number2 % 2 != 0) counter++;
        if (number3 % 2 != 0) counter++;
        System.out.println("Odd number count: " + counter);
    }
}
