package com.softserve.edu09.pt;

import java.util.LinkedList;
import java.util.List;

class Pt1 {

    public static void foo() {

        List<HeavyBox> myList = new LinkedList<>();
        myList.add(new HeavyBox(10, "Box 1"));
        myList.add(new HeavyBox(20, "Box 2"));
        myList.add(new HeavyBox(30, "Box 3"));
        myList.add(new HeavyBox(40, "Box 4"));
        myList.add(new HeavyBox(50, "Box 5"));

        for (var el : myList) {
            System.out.println(el);
        }
        System.out.println("-".repeat(30));

        myList.get(0).setWeight(45698);
        myList.remove(myList.size() - 1);
        for (var el : myList) {
            System.out.println(el);
        }
        System.out.println("-".repeat(30));

        myList.clear();

        for (var el : myList) {
            System.out.println(el);
        }
    }
}
