package com.softserve.edu11.hw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchCurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть текст, що містить кілька екземплярів формату валюти США:");
        String inputText = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\$[0-9]+\\.[0-9]{2}");
        Matcher matcher = pattern.matcher(inputText);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}