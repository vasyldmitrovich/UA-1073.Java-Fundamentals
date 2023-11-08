package com.softserve.edu11.hw.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text containing US currency format:");
        String inputText = scanner.nextLine();

        String regex = "\\$\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(inputText);

        System.out.println("Result:");

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
