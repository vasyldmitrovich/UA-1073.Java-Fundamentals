package com.softserve.edu01.pt;

import java.util.Scanner;

public class Pt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString = scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString = scanner.nextLine();
        System.out.println("Enter the third string:");
        String thirdString = scanner.nextLine();
        System.out.println("Reversed Order:");
        System.out.println(thirdString);
        System.out.println(secondString);
        System.out.println(firstString);
    }
}

