package com.softserve.edu11.hw.task1;

import java.util.Arrays;

public class Task1 {
    private static final String REGULAR_SPLIT = "\\W+";
    private final String text;

    public Task1(String text) {
        this.text = text;
    }

    public String getLongestWordFromText(){
        var splitText = splitSentence();
        Arrays.sort(splitText, (w1, w2) -> Integer.compare(w2.length(), w1.length()));
        return splitText[0];
    }

    public int getNumLettersInLongestWord(){
        var word = getLongestWordFromText();
        return word.length();
    }

    public String getReversSecondWord(){
        var words = splitSentence();
        var word = new StringBuilder(words[1]);

        return word.reverse().toString();
    }

    private String[] splitSentence(){
        return text.split(REGULAR_SPLIT);
    }
}
