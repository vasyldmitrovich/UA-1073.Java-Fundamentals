package com.softserve.edu13.pt.task2;

import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        var ints = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println("Total: "+count(ints, e -> true));
        System.out.println("Even: "+count(ints, e -> e % 2 == 0));
        System.out.println("Odd: "+count(ints, e -> e % 2 == 1));
    }

    static int count (List<Integer> list, Predicate<Integer> filter){
        int res =0;
        for(var el : list){
            if (filter.test(el)){
                res++;
            }
        }
        return res;
    }
}
