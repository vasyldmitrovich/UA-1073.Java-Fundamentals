package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Enter sentence");
        String str = SCANNER.nextLine();

        var matcher = getInstanceOfDollar(str);

        System.out.print("Dollar instances: ");

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }

    public static Matcher getInstanceOfDollar (String str) {
        String pattern = "\\$\\d+";
        Pattern currencyPattern = Pattern.compile(pattern);
        Matcher matcher = currencyPattern.matcher(str);

        return matcher;
    }
}
