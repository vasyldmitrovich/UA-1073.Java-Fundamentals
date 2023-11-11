package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a text containing US currency formats:");
        String inputText = scanner.nextLine();
        String usCurrencyPattern = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(usCurrencyPattern);
        Matcher matcher = pattern.matcher(inputText);
        System.out.println("Occurrences of US currency format:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

