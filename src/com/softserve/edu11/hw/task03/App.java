package com.softserve.edu11.hw.task03;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = scanner.nextLine();
        Pattern p = Pattern.compile("\\$\\d+.\\d{2}");
        Matcher m = p.matcher(str);
        System.out.println("Instances of US currency:");
        while (m.find()) {
            System.out.println(str.substring(m.start(), m.end()));
        }
    }
}
