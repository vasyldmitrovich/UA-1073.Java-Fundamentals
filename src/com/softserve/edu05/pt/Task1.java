package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {

    public static void run() {//Nice
        String[] names = {"Lilly", "John", "Bob", "Anna", "Sarah", "Denis"};
        System.out.println("Unsorted String array: " + Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("Sorted String array: " + Arrays.toString(names));
        int[] numbers = {5, 12, 34, 8, 99};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Integer array: " + Arrays.toString(numbers));
        System.out.println("Average value for integer array is " + (double) sum / numbers.length);
        System.out.print("Enter name to search: ");
        Scanner console = new Scanner(System.in);
        String enteredName = console.nextLine();
        boolean isName = false;
        for (String name : names) {
            isName = name.equals(enteredName) ? true : isName;
        }
        System.out.println("The entered name is " + (isName ? "present" : "not present") + " in the String array");
    }
}
