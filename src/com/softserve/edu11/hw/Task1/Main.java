package com.softserve.edu11.hw.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 5 words");
        String sentence = scanner.nextLine();
        String[] split = sentence.split(" ");
        int longestCount = 0;
        String word = "";
        for (int i = 0; i < split.length; i++) {
           if(split[i].length() > longestCount)  {
               longestCount = split[i].length();
               word = split[i];
           }
        }
        System.out.printf("The longest word is %s, with %s letters%n", word, longestCount);
        System.out.println(new StringBuilder(split[1]).reverse());
    }
}
