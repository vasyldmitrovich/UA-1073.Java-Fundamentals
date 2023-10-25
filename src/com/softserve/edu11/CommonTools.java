package com.softserve.edu11;

import java.util.Scanner;

public class CommonTools {
    private static final Scanner SCANNER = new Scanner(System.in);

    private CommonTools() {
        throw new IllegalStateException("Utility class");
    }

    public static String readLine(String prompt){
        System.out.print(prompt);
        return SCANNER.nextLine();
    }
}
