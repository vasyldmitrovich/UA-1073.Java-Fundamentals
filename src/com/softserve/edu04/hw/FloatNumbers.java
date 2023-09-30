package com.softserve.edu04.hw;

import java.util.Scanner;

public class FloatNumbers {

    public static void checkNumbers () {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Hello. We will check three FLOAT numbers, are they belongs to the range [-5, 5]
                Please input first Float number:""");
        check(sc);
        System.out.println("Input 2 Float number");
        check(sc);
        System.out.println("Input 3 Float number");
        check(sc);
    }

    private static void check (Scanner sc) {
        float n = sc.nextFloat();
        if (n >= -5 && n <= 5) {
            System.out.println("\"" + n + "\" belongs to range [-5, 5]");
        } else {
            System.out.println("\"" + n + "\" doesn't belongs to range [-5, 5]");
        }
    }


}
