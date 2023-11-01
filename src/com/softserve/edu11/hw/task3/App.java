package com.softserve.edu11.hw.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        Pattern pattern = Pattern.compile("(?<!\\S)\\$\\d+([.{1}]\\d{1,2})?");
        Matcher matcher = pattern.matcher(sentence);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
