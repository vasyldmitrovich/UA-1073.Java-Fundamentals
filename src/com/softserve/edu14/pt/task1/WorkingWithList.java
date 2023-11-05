package com.softserve.edu14.pt.task1;

import java.util.List;
import java.util.stream.Collectors;

public class WorkingWithList {
    private WorkingWithList() {
        throw new IllegalStateException("Utility WorkingWithList class");
    }
    public static long numEmptyLines(List<String> lines) {
        return lines.stream()
                .filter(String::isEmpty)
                .count();
    }

    public static List<String> removeEmptyLines(List<String> lines) {
        return lines.stream()
               .filter(line ->!line.isEmpty())
               .toList();
    }

    public static String uppercaseAndJoin(List<String> lines) {
        return lines.stream()
              .map(String::toUpperCase)
              .collect(Collectors.joining(","));
    }
}
