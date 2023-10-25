package com.softserve.edu11.hw.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    private static final String PATTERN_US_CURRENCY = "\\$\\d+\\.\\d{2}";
    private Task3() {
        throw new IllegalStateException("Utility class");
    }

    public static String getAllUSCurrency(String text){
        var builder = new StringBuilder();

        Pattern pattern = Pattern.compile(PATTERN_US_CURRENCY);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            builder.append(text, matcher.start(), matcher.end());
            builder.append(" ");
        }

        if(!builder.isEmpty()){
            builder.deleteCharAt(builder.length() - 1);
        }

        return builder.toString();
    }
}
