package com.softserve.edu09.pt.task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        var scan = new Scanner(System.in);

        String line = scan.nextLine();
        String[] token = line.split(",");
        for (var element : token) {
            set.add(Integer.parseInt(element));

        }
        System.out.println(set);

    }
}
