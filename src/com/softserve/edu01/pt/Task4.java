package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("How are you?");
        Scanner console = new Scanner(System.in);
        String answer = console.nextLine();
        System.out.println("You are " + answer);
    }
}
