package com.softserve.edu09.pt;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main (String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random(10);

        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(0, 30));
        }

        System.out.println(myCollection);

        // task 3.1
        List<Integer> newCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }

        System.out.println(newCollection);

        // task 3.2
        // myCollection.removeIf(el -> el > 20);

        var it = myCollection.iterator();

        while (it.hasNext()) {
            if (it.next() > 20) {
                it.remove();
            }
        }

        System.out.println(myCollection);

        // task 3.3.
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("position - " + i + ", value of element - " + myCollection.get(i));
        }

        // task 3.4
        myCollection.sort(Comparator.naturalOrder());
        System.out.println(myCollection);
    }
}
