package com.softserve.edu11.hw.Task2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        Pattern p = Pattern.compile("[A-Za-z]+\s{1}");
        Matcher m = p.matcher(sentence);
        while (m.find()) {
            System.out.print(sentence.substring(m.start(), m.end()));
        }
    }
}
