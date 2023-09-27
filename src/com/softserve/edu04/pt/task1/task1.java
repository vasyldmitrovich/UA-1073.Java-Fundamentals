package com.softserve.edu04.pt.task1;

import java.util.Scanner;

public class task1 {
    public void odd() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 3 numbers: ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int thirdNum = scanner.nextInt();

        int coutOdd = 0;

        if (firstNum % 2 == 0) {
            coutOdd++;
        }
        if (secondNum % 2 == 0) {
            coutOdd++;
        }
        if (thirdNum % 2 == 0) {
            coutOdd++;
        }
        System.out.println("Cout of odd numbers = " + coutOdd);

    }
}
