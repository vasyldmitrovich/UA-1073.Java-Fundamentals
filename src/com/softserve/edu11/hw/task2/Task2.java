package com.softserve.edu11.hw.task2;


public class Task2 {
    public static void main(String[] args) {

        String text = "Hello,   I   am  learning   Java  Fundamental.";

        String correctedText = text.replaceAll("\\s+", " ");
        System.out.printf("Original text: %s \nCorrected text: %s",text,correctedText );

    }
}
