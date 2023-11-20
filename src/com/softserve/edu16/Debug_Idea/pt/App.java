package com.softserve.edu16.Debug_Idea.pt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        int countCharacters = 0;
        String testWord;
        String character = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println("Inpur character");
        character = br.readLine();
        for (int i = 0; i < testWord.length(); i++) {
            String character1 = String.valueOf(testWord.charAt(i)); //that was problem line
            if (character.equals(character1)) countCharacters++;
        }
        System.out.println("There are character " + character + " "
                + countCharacters + " times in the word " + testWord);

    }
}