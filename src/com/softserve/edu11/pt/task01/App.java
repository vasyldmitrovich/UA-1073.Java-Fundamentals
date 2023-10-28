package com.softserve.edu11.pt.task01;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String str2 = scanner.nextLine();
        System.out.println("String 2 " + (str2.contains(str1) ? "" : "don`t ") + "contain string 1");
    }
}
