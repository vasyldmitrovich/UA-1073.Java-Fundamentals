package com.softserve.edu04.hw;

import java.util.Scanner;

public class ThreeIntegers {

    private static int min;
    private static int max;

    public static void minAndMax () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1 Integer");
        max = sc.nextInt();
        min = max;
        System.out.println("Input 2 Integer");
        int n2 = sc.nextInt();
        System.out.println("Input 3 Integer");
        int n3 = sc.nextInt();

        // check max Integer
        max = (n2 > max && n2 > n3) ? n2 : max;
        max = n3 > max ? n3 : max;

        //check min integer
        min = (n2 < min && n2 < n3) ? n2 : min;
        min = Math.min(min, n3);

        System.out.println("Minimum number - " + min + "\nMaxim number - " + max);
    }
}
