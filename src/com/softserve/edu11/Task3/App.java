package com.softserve.edu11.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text containing US currency format:");
        String inputText = scanner.nextLine();

        String currencyPattern = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(currencyPattern);

        Matcher matcher = pattern.matcher(inputText);

        System.out.println("US Currency Format occurrences in the text:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        scanner.close();
    }
}

