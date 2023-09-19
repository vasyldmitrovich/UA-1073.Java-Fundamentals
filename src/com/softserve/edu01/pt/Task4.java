package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you?");

        String answer = scanner.nextLine();

        System.out.printf("You are %s", answer);
    }
}
