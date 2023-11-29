package com.softserve.edu12.hw;

import java.util.Scanner;

public class readnumber {
    public static int readNumber(int start, int end) throws NumberFormatException {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Введіть ціле число з діапазону [" + start + "; " + end + "]: ");
    String input = scanner.nextLine();

    int number;
    try {
        number = Integer.parseInt(input);
    } catch (NumberFormatException e) {
        throw new NumberFormatException("Недійсне число");
    }

    if (number < start || number > end) {
        throw new NumberFormatException("Число поза діапазоном");
    }

    return number;
}
}
