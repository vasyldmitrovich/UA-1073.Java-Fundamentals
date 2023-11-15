package com.softserve.edu13.pt.Task4;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        var ints = List.of(1,2,3,4,5,6,7,8,9);
        System.out.println("Total " + count(ints, (el -> true)));
        System.out.println("Even " + count(ints, (el -> el% 2 == 0)));
        System.out.println("Odd " + count(ints, (el -> el % 2 == 1)));
        System.out.println("Greater then 3 " + count(ints, (el -> el>3)));

    }
    static int count (List<Integer> list, Predicate <Integer> filter) {
        int counter = 0;
        for (var el: list) {
          if (filter.test(el) ) {
              counter++;
          }
        }
        return counter;
    }

}
