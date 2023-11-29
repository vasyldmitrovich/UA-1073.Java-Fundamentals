package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text containing the US currency format: ");
        String input = scanner.nextLine();
        String currencyPattern = "\\$\\d+\\.\\d{2}";
        Pattern pattern = Pattern.compile(currencyPattern);
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            System.out.println("Found: " + matcher.group());
        }
    }
}
