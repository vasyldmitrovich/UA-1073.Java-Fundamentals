package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task1 {
    private static final int COUNT_STRING = 3;
    public void exec(){
        Scanner scanner = new Scanner(System.in);
        String[] sentences = new String[COUNT_STRING];

        System.out.println("Task #1");

        for(int i = 0; i < COUNT_STRING; ++i){
            System.out.printf("Enter sentence #%d: ", i + 1);
            sentences[i] = scanner.nextLine();
        }

        System.out.println("\nOutputting sentences:");

        for(int i = sentences.length - 1; i >= 0; --i){
            System.out.println(sentences[i]);
        }

        System.out.println("\n\n");
    }
}
