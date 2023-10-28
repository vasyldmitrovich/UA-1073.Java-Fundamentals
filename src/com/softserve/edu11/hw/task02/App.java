package com.softserve.edu11.hw.task02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        System.out.printf("Result string: %s%n", str.replaceAll("\\s{2,}", " "));
    }
}
