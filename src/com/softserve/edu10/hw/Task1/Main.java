package com.softserve.edu10.hw.Task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);
        System.out.println(set1);
        set1.retainAll(set2);
        System.out.println(set1);
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
