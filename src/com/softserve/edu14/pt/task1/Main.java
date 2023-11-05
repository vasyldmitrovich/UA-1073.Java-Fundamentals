package com.softserve.edu14.pt.task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");

        var numEmpty = WorkingWithList.numEmptyLines(list);
        var listWithoutEmpty = WorkingWithList.removeEmptyLines(list);
        var uppercaseAndJoined = WorkingWithList.uppercaseAndJoin(list);

        System.out.println("Input list: " + list);
        System.out.println("The number of empty lines: " + numEmpty);
        System.out.println("A list without empty lines: " + listWithoutEmpty);
        System.out.println("Combined strings are in upper case: " + uppercaseAndJoined);
    }
}
