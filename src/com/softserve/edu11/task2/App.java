package com.softserve.edu11.task2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        System.out.println(sentence.replaceAll(" +", " "));
    }

}
