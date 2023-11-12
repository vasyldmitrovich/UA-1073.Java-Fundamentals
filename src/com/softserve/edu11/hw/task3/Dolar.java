package com.softserve.edu11.hw.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dolar {
    public static void main(String[] args) {

        String sentence = "I have $100.50 dolars and $50 in my wallet, and $25.321 dolars in bank. ";

        Pattern pattern = Pattern.compile("(?<!\\S)\\$\\d+([.{1}]\\d{1,2})?");

        Matcher matcher = pattern.matcher(sentence);

        System.out.println("All USA currency formats in this sentence: ");
        while (matcher.find()) {
            System.out.println(matcher.group());

        }

    }
}

