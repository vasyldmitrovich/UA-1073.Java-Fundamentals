package com.softserve.edu11.hw.task2;

import com.softserve.edu11.CommonTools;

public class Main {
    public static void main(String[] args) {
        String text = CommonTools.readLine("Enter the text: ");
        text = Task2.replaceAllConsecutiveSpacesSingleSpace(text);
        System.out.printf("Formatted text: %s%n", text);
    }
}
