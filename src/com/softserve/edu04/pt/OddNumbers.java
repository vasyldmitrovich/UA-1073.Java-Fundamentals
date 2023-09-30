package com.softserve.edu04.pt;
import java.util.Scanner;

public class OddNumbers {
    private static int oddCalc;

    public static void calcOddNumb () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. Let's find out how many numbers are odd. Totally pls input 3 numbers.\n Input 1 number:");
        if (sc.nextInt() % 2 == 1) oddCalc++;
        System.out.println("Input 2 number:");
        if (sc.nextInt() % 2 == 1) oddCalc++;
        System.out.println("Input 3 number:");
        if (sc.nextInt() % 2 == 1) oddCalc++;
        System.out.println("So, there are " + oddCalc + " numbers");
    }
}
