package com.softserve.edu11.pt.task3;

import java.util.Scanner;

public class ValidName {
    public static void task3() {

        var scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter your name: ");
            String name = scan.nextLine();

            if (isValue(name)) {
                System.out.println("The name *" + name + "* is valid!");
            } else {
                System.out.println("The name *" + name + "* is Invalid");
            }


        }


    }

    public static boolean isValue(String name) {
        return name.matches("\\w{3,15}");
    }
}



