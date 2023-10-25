package com.softserve.edu11.hw.task1;

import com.softserve.edu11.CommonTools;

public class Main {
    public static void main(String[] args) {
        String text = CommonTools.readLine("Enter a sentence: ");
        Task1 workWithSentence = new Task1(text);

        System.out.printf("The longest word: %s%n", workWithSentence.getLongestWordFromText());
        System.out.printf("The length of the longest word: %d%n", workWithSentence.getNumLettersInLongestWord());
        System.out.printf("Second word in reverse order: : %s%n", workWithSentence.getReversSecondWord());
    }
}
