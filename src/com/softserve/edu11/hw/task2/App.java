package com.softserve.edu11.hw.task2;

public class App {
    public static void main(String[] args) {
        String text = "I    am    learning     Java    Fundamental";
        System.out.println(text);
        String editedText = text.replaceAll("\\s{2,}", " ");
        System.out.println(editedText);
    }
}
