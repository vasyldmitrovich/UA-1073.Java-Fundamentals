package com.softserve.edu09.pt.task2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        var scanner = new Scanner(System.in);

        System.out.print("Enter the numbers: ");
        String line = scanner.nextLine();
        String[] numbers = line.split(", ");

        for (var item : numbers) {
            set.add(Integer.parseInt(item));
        }
        System.out.println(set);
    }
}
