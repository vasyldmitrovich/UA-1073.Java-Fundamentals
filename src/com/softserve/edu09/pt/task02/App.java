package com.softserve.edu09.pt.task02;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        String[] tokens = line.split(",");
        Set<Integer> set = new HashSet<>();
        for (String token : tokens) {
            set.add(Integer.parseInt(token));
        }
        System.out.println(set);
    }
}
