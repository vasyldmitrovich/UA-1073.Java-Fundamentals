package com.softserve.edu13.pt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main (String[] args) {
        var list = Arrays.asList("A", "C", "D", "B");
        sortList(list);
        System.out.println(list);
    }

    static void sortList(List<String> list) {
        list.sort(String::compareToIgnoreCase);
    }
}
