package com.softserve.edu11.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String[] texts = {"$33","Bye", "$33.0", "$44.45", "Hello", "45.76"};

        String pattern1 = "\\$\\d+(\\.\\d{2})";
        String pattern2 = "\\$\\d+(\\.\\d{1})";
        String pattern3 = "\\$\\d+";

        Pattern currencyPattern1 = Pattern.compile(pattern1);
        Pattern currencyPattern2 = Pattern.compile(pattern2);
        Pattern currencyPattern3 = Pattern.compile(pattern3);

        for (int i = 0; i < texts.length; i++) {
            Matcher matcher1 = currencyPattern1.matcher(texts[i]);
            Matcher matcher2 = currencyPattern2.matcher(texts[i]);
            Matcher matcher3 = currencyPattern3.matcher(texts[i]);

            if (matcher1.find() || matcher2.find() || matcher3.find()) {
                System.out.println("Found in t" + (i + 1) + ": " + texts[i]);
            }
        }
    }
}
