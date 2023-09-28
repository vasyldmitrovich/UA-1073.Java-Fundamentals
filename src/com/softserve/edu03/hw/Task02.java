package com.softserve.edu03.hw;

import java.util.Scanner;


public class Task02 {
    public static void myTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three integers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        int min = number1;
        if (min > number2) {
            min = number2;
        }
        if (min > number3) {
            min = number3;
        }

        System.out.println("The smallest number is " + min);

    }


}
