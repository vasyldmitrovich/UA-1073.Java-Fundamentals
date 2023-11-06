package com.softserve.edu11.hw.task1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("[^a-zA-Z'-]+");
        for (int i = 0; i < 5; i++) {
            System.out.println(words[i]);
        }
        String longestWord = "";
        for (var word : words){
               if (word.length()>longestWord.length()){
                   longestWord = word;
               }
        }
        System.out.println("Longes word : " + longestWord);
        System.out.println(longestWord.length());
        String reversedLongWord = new StringBuilder(words[1]).reverse().toString();
        System.out.println(reversedLongWord);
    }
}
