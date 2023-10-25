package com.softserve.edu11.pt.task3;

public class Task3 {
    private static final String REGULAR_EXPRESSION = "\\w{3,15}";
    private Task3() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isValidName(String name){
        return name.matches(REGULAR_EXPRESSION);
    }
}
