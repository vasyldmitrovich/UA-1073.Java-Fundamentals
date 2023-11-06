package com.softserve.edu11.hw.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        String pattern = "\\$\\d+(\\.\\d{2})?";
        Pattern currencyPattern = Pattern.compile(pattern);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input text:");
        String inputText = scanner.nextLine();

        Matcher matcher = currencyPattern.matcher(inputText);

        System.out.println("Found $USDT:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
