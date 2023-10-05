package com.softserve.edu01.pt;

import java.util.Scanner;

class Task1 {
    static void reverseOrder() {
        String firstNumber;
        String secondNumber;
        String thirdNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("write first text and press enter");
        firstNumber = scanner.nextLine();
        System.out.println("write second text and press enter");
        secondNumber = scanner.nextLine();
        System.out.println("write third text and press enter");
        thirdNumber = scanner.nextLine();
        System.out.println("reverse order of your text");
        System.out.println(thirdNumber);
        System.out.println(secondNumber);
        System.out.println(firstNumber);
    }
}
