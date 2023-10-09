package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task01 {//Good
    public static void oddNumbers() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter three numbers to explore");
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int num3 = scn.nextInt();
        int count = 0;

        if (num1 % 2 != 0) {
            count++;
        }  if (num2 % 2 != 0) {
            count++;
        }  if (num3 % 2 != 0) {
            count++;
        }
        System.out.println("Quantity of odd numbers is " + count);
    }
}
