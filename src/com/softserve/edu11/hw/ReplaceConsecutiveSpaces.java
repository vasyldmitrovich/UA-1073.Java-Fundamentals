package com.softserve.edu11.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceConsecutiveSpaces {

    public static void main(String[] args) {
        String inputSentence = "I    am    learning     Java    Fundamental";
        String outputSentence = replaceConsecutiveSpaces(inputSentence);
        System.out.println(outputSentence);
    }
    private static String replaceConsecutiveSpaces(String inputSentence) {
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(inputSentence);
        return matcher.replaceAll(" ");
    }
}