package com.softserve.edu01.pt;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Imput 1 number:  ");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Imput 2 number:_ ");
        int n2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Imput 3 number:_ ");
        int n3 = Integer.parseInt(scanner.nextLine());
        double avg = (n1 + n2 + n3) / 3.0;
        System.out.printf("Average is: %.2f", avg);

    }
}
