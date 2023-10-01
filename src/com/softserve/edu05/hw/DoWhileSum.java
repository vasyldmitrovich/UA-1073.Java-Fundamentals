package com.softserve.edu05.hw;


import java.util.Scanner;

public class DoWhileSum {

    static void doWhileSum() {
        Scanner sc = new Scanner(System.in);
        String decision;
        do {
            System.out.println("Lets calculate sum of 2 Integers.\nInput 1 Integer:");
            int a = sc.nextInt();
            System.out.println("Input 2 Integer");
            int b = sc.nextInt();
            System.out.println(a + " + " + b + " = " + (a + b));
            System.out.println("Do you want to continue calculation? (Input \"Yes\" or \"No\")");
            decision = sc.next();
        } while (decision.equalsIgnoreCase("yes"));
        if (decision.equalsIgnoreCase("no")) {
            System.out.println("You chose \"No\" so i stopped program.");
        } else {
            System.out.println("You said \"" + decision + "\", so i decided to finish program.");
        }
    }
}
