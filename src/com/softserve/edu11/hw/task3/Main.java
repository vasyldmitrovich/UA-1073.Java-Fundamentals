package com.softserve.edu11.hw.task3;

import com.softserve.edu11.CommonTools;

public class Main {
    public static void main(String[] args) {
        String text = CommonTools.readLine("Enter the text: ");
        String result = Task3.getAllUSCurrency(text);

        System.out.printf("All occurrences of the US currency format: %s%n", result);
    }
}
