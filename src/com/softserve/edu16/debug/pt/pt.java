package com.softserve.edu16.debug.pt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pt {
    public static void main(String[] args) throws IOException {
        int countCharacters = 0;
        String testWord;
        String character;
        var br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input word");
        testWord = br.readLine();
        System.out.println("Input character");
        character = br.readLine();
        for (int i = 0; i < testWord.length(); i++) {
            String currentCharacter = String.valueOf(testWord.charAt(i));
            if (currentCharacter.equals(character)) {
                countCharacters++;
            }
        }

        System.out.println("Character '" + character + "' appears " + countCharacters + " times in the word '" + testWord + "'");
    }
}

