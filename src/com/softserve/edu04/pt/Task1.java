package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int counter = 0;
        if (n1 % 2 == 1) counter++;
        if (n2 % 2 == 1) counter++;
        if (n3 % 2 == 1) counter++;
        System.out.println("There are " + counter + " odd number in the input");
    }
}