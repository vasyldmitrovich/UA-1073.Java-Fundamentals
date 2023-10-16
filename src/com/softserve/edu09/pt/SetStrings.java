package com.softserve.edu09.pt;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetStrings {
    public static void main (String[] args) {
        Set<Integer> set = new HashSet<>();

        var scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] tokens = line.split(",");

        for (var el : tokens) {
            set.add(Integer.parseInt(el));
        }

        System.out.println(set);
    }
}
