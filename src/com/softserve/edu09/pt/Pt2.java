package com.softserve.edu09.pt;

import java.util.*;

class Pt2 {

    public static void pt2 (){
        List<Integer> myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, please input any numbers separated by \",\":");

        String[] input = sc.nextLine().split(",");

        for (String s : input) {
            myList.add(Integer.valueOf(s));
        }
        System.out.println("You entered - " + myList);

        Set<Integer> mySet = new HashSet<>(myList);
        System.out.println("You entered without duplicates - " + mySet);
    }
}
