package com.softserve.edu01.pt;

import java.util.Scanner;

public class Pt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How are you?");
        String answer = scanner.nextLine();
        System.out.println("You are " + answer);
        scanner.close();
    }
}


