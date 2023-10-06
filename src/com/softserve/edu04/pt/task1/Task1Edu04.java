package com.softserve.edu04.pt.task1;

import java.util.Scanner;

public class Task1Edu04 {
    public static void task1Edu04() {//Why you do not call this method from class App.java?

        var scan = new Scanner(System.in);

        System.out.println("Input three numbers please:");

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        int counter = 0;

        if (number1 % 2 ==1) {
            counter ++;
        }
        if (number2 % 2 ==1) {
            counter ++;
        }
        if (number3 % 2 ==1) {
            counter ++;
        }
        System.out.println("There are " + counter + " odd numbers here.");

    }
}
