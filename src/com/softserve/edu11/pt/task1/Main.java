package com.softserve.edu11.pt.task1;

import com.softserve.edu11.CommonTools;

public class Main {
    public static void main(String[] args) {
        String substring = CommonTools.readLine("Enter a substring: ");
        String text = CommonTools.readLine("Enter the text: ");

        System.out.println(text.contains(substring));
    }
}
