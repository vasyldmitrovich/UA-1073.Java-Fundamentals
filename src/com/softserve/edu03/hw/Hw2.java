package com.softserve.edu03.hw;

import java.util.Scanner;

class Hw2 {

        static String smallestNumber (){
        Scanner scanner = new Scanner(System.in);
        int min;
        System.out.println("We will find the smallest number. \n" +
                "Input the first number:");
        min = scanner.nextInt();
        System.out.println("Input the second number:");
        int b = scanner.nextInt();
        if (b < min) {
            min = b;
        }
        System.out.println("Input the third number:");
        int c = scanner.nextInt();
        if (c < min) {
            min = c;
        }

        return "The smallest number is: " + min;
    }
}
