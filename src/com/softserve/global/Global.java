package com.softserve.global;

import java.util.Locale;
import java.util.Random;

public class Global {
    public static final Random RANDOM = new Random();
    public static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static final String LOWER = UPPER.toLowerCase(Locale.ROOT);

    public static final String LETTERS = UPPER + LOWER;

    public static String getRandomString(int length) {
        char[] chars = LETTERS.toCharArray();
        char[] resultChars = new char[length];

        for (int i = 0; i < length; i++) {
            int randomIndex = RANDOM.nextInt(0, chars.length - 1);
            char randomChar = chars[randomIndex];
            resultChars[i] = randomChar;
        }

        return String.valueOf(resultChars);
    }
}
