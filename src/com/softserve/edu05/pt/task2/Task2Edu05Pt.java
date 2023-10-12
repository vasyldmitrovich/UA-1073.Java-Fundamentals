package com.softserve.edu05.pt.task2;

import java.util.Scanner;

public class Task2Edu05Pt {
    public static void task2Edu05Pt() {

        var scan = new Scanner(System.in);

        System.out.println("Enter positive number: ");
        int inputNum = scan.nextInt();
        scan.nextLine();

        if (prime(inputNum) == true) {
            System.out.println(inputNum + " is a simple number");
        } else {
            System.out.println(inputNum + " Is not a simple number");
        }


    }

    public static boolean prime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;

    }


}

