package com.softserve.edu09.pt.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 15; i++) {
            myCollection.add(rnd.nextInt(0, 30));
        }

        System.out.println(myCollection);
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }

        System.out.println(newCollection);
        myCollection.removeIf(el -> el > 20);
        System.out.println(myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        System.out.println(myCollection);

        myCollection.sort(Integer::compareTo);
        System.out.println("Sorted Collection: " + myCollection);

    }
}
