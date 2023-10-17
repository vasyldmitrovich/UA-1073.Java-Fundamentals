package com.softserve.edu09.pt.task03;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(30));
        }
        System.out.println(myCollection);
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);
        var it = myCollection.iterator();
        while (it.hasNext()) {
            if (it.next() > 20) {
                it.remove();
            }
        }
        System.out.println(myCollection);
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }
        Collections.sort(myCollection);
        System.out.println(myCollection);
    }
}
