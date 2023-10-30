package com.softserve.edu11.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\$\\d*\\.\\d{2}");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
