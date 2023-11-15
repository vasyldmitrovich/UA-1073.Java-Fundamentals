package com.softserve.edu05.pt;

import com.softserve.global.Global;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;

public class SortStringArray {
    public static String[] getStringArray(int length) {
        String[] strings = new String[length];
        for (int i = 0; i < length; i++) {
            String randomString = Global.getRandomString(5);
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
