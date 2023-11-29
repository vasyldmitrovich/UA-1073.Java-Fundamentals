package com.softserve.edu12.hw;

import static com.softserve.edu12.hw.readnumber.readNumber;

public class main {
    public static void main(String[] args) {
    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++) {
        try {
            numbers[i] = readNumber(1, 99);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return;
        }
    }

    System.out.println("Введені числа:");
    for (int number : numbers) {
        System.out.println(number);
    }
}
}
