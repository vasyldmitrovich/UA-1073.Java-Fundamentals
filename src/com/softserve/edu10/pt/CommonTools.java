package com.softserve.edu10.pt;

import java.util.Scanner;

public class CommonTools {
    private static final Scanner SCANNER = new Scanner(System.in);

    private CommonTools(){}

    public static <T extends Number> T readLineAndConvertToNumber(String prompt, Class<T> numberClass) {
        T enteredNum = null;

        while (true) {
            String input = readLine(prompt);

            try {
                if (numberClass == Integer.class) {
                    enteredNum = numberClass.cast(Integer.parseInt(input));
                } else if (numberClass == Double.class) {
                    enteredNum = numberClass.cast(Double.parseDouble(input));
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return enteredNum;
    }

    public static String readLine(String prompt){
        System.out.print(prompt);
        return SCANNER.nextLine();
    }
}
