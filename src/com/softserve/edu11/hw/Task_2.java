package com.softserve.edu11.hw;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        System.out.println(words.replace("  ", " "));
    }
}
