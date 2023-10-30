package com.softserve.edu11.hw;

public class Task2 {
    public static void main(String[] args) {
        String sentence = "I  am  learning  Java  Fundamental.";
        sentence = sentence.replaceAll("\\s+", " ");

        System.out.println(sentence);

    }
}
