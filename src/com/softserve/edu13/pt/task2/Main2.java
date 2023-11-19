package com.softserve.edu13.pt.task2;

import java.util.Arrays;

public interface Main2 {
    public static void main(String[] args) {
        var list = Arrays.asList("Bob", "Alice");
        list.sort((s1, s2) -> s2.compareTo(s2));
        System.out.println(list);
    }
}
