package com.softserve.edu11.hw.Task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Pattern p = Pattern.compile("[$]+");
        Matcher m = p.matcher(string);
        while (m.find()) {
            System.out.println(string.substring(m.start(), m.end()));
        }

    }
}
