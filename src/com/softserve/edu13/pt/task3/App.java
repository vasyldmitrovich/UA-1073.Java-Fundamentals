package com.softserve.edu13.pt.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bob", "Mark", "Alice", "Andrii", "Nadia");
        System.out.print("List before sorting: ");
        System.out.println(list);

        sortStringList(list, String::compareTo);

        System.out.print("List after sorting: ");
        System.out.println(list);
    }

    public static void sortStringList(List<String> list, Comparator<String> comparator) {
        list.sort(comparator);
    }
}
