package com.softserve.edu11.pt;

import java.util.Scanner;

public class Task1 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Enter string 1");
        String s1 = SCANNER.nextLine();

        System.out.println("Enter string 2");
        String s2 = SCANNER.nextLine();

        boolean isSubstring = checkIfSubstring(s1, s2);
        if (isSubstring) {
            System.out.println("String 1 is a substring of String 2");
        } else {
            System.out.println("String 1 isn't a substring of String 2");
        }
    }

    public static boolean checkIfSubstring (String str1, String str2) {
        return str2.contains(str1);
    }
}
