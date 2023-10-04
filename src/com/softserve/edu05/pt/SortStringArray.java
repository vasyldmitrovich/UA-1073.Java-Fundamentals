package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class SortStringArray {
    public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String LOWER = UPPER.toLowerCase(Locale.ROOT);

    public static final String LETTERS = UPPER + LOWER;

    public static String getRandomString(int length) {
        char[] chars = LETTERS.toCharArray();
        char[] resultChars = new char[length];

        for (int i = 0; i < length; i++) {
            int randomIndex = new Random().nextInt(0, chars.length - 1);
            char randomChar = chars[randomIndex];
            resultChars[i] = randomChar;
        }

        return String.valueOf(resultChars);
    }

    public static String[] getStringArray(int length) {
        String[] strings = new String[length];
        for (int i = 0; i < length; i++) {
            String randomString = SortStringArray.getRandomString(5);
            strings[i] = randomString;
        }
        return strings;
    }

    public static void sort (String[] strings) {
        Arrays.sort(strings);
    }

    public static boolean containsString (String[] strings, String findInput) {
        return Arrays.asList(strings).contains(findInput);
    }
}
