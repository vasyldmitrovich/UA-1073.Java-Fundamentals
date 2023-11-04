package com.softserve.edu09.pt.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3PT {
    public static void task3pt() {

        List<Integer> myCollection = new ArrayList<>();
        var random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(0, 30));

        }
        System.out.println("All list: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i) > 5 ) {
                newCollection.add(i);
            }
        }
        System.out.println("Index of digits greater than five: " + newCollection);

        myCollection.removeIf(el -> el > 20);
        System.out.println("List without numbers greater than twenty: " + myCollection);

        myCollection.sort(null);
        System.out.println("Sorted list: " + myCollection);





    }

}
