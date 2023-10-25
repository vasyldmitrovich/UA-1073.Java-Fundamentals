package com.softserve.edu11.pt.task2;

public class Task2 {
    private Task2() {
        throw new IllegalStateException("Utility class");
    }

    public static String formatText(String firstName, String lastName, String middleName){
        return lastName +
                " " +
                firstName.charAt(0) +
                "." +
                middleName.charAt(0) +
                ".\n" +
                firstName +
                "\n" +
                firstName +
                " " +
                middleName +
                " " +
                lastName;
    }
}
