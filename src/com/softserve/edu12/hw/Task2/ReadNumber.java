package com.softserve.edu12.hw.Task2;

import java.util.Arrays;
import java.util.Scanner;

public class ReadNumber {
    static Scanner SCANNER = new Scanner(System.in);
    public static void readNumbers ( ) {
        for (int i = 0; i < 10; i++) {
           int num = checkNumber();
           System.out.println("Your number is " + num);
        }
    }
    public static int checkNumber () {
        while (true) {
            try {
                System.out.println("input number");
                int n = Integer.parseInt(SCANNER.nextLine());
                startFinishCheck(n);
                return n;

            } catch (NumberFormatException e) {
                System.out.println("ERROR: input number");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static int startFinishCheck (int n) {
        if (n < 0 ||  n > 5 ) {
            throw new IllegalArgumentException("ERROR: your number out of boundary");

        } return n;
    }

}
