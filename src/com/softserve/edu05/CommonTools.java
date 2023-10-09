package com.softserve.edu05;

import java.util.Scanner;

public class CommonTools {
    public static <T extends Number> T readLineAndConvertToNumber(String prompt, Class<T> numberClass) {
        T enteredNum = null;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine();

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

    public static <T extends Comparable<T>> void sortArrayBubbleAscendingOrder(T[] array){
        for (int i = 1; i < array.length - 1; ++i){
            for(int j = 0; j < array.length - i; ++j){
                if(array[j].compareTo(array[j + 1]) > 0){
                    T buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }
        }
    }

    public static <T> void printArray(T[] array, String title){
        System.out.println(title);
        for(T element : array){
            System.out.printf("\t%s%n", element);
        }
    }
}
