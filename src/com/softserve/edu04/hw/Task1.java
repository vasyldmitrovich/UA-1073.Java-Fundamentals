package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {
    public static void run() {//Good
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 3 float numbers:");
        float num1 = console.nextFloat();
        float num2 = console.nextFloat();
        float num3 = console.nextFloat();
        boolean result = num1 >= -5 && num1 <= 5 && num2 >= -5 && num2 <= 5 && num3 >= -5 && num3 <= 5;
        System.out.println(result ? "All numbers are in range from -5 to 5" : "Some numbers are not in range from -5 to 5");
    }
}
