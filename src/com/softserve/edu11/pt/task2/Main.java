package com.softserve.edu11.pt.task2;

import com.softserve.edu11.CommonTools;

public class Main {
    public static void main(String[] args) {
        String lastName = CommonTools.readLine("Enter the last name: ");
        String firstName = CommonTools.readLine("Enter the first name: ");
        String middleName = CommonTools.readLine("Enter the middle name: ");

        System.out.printf("%nFormatted text: %n%s%n", Task2.formatText(firstName, lastName, middleName));
    }
}
