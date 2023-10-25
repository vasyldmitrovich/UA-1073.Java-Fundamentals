package com.softserve.edu11.hw.task2;

public class Task2 {
    private static final String REGEX = "\\s+";
    private static final String REPLACEMENT = " ";

    private Task2() {
        throw new IllegalStateException("Utility class");
    }

    public static String replaceAllConsecutiveSpacesSingleSpace(String text){
        return text.replaceAll(REGEX, REPLACEMENT);
    }
}
