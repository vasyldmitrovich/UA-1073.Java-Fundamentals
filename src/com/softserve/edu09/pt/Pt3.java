package com.softserve.edu09.pt;

import com.softserve.edu09.RandomListOf10Integers;

import java.util.*;

class Pt3 {


    public static void foo() {
        List<Integer> myCollection = RandomListOf10Integers.createAndFillRandomLinkedList(10,0,30);

        System.out.println("Create and fill randomly new collection - " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        int position = 0;
        for (var el : myCollection) {
            if (el > 5) {
                newCollection.add(position);
            }
            position++;
        }
        System.out.println("newCollection of all positions of elements more than 5 - " + newCollection);


        List<Integer> myCollection2 = new LinkedList<>(myCollection.subList(0, myCollection.size()));

        Iterator<Integer> iterator = myCollection2.iterator();
        int number;
        while (iterator.hasNext()) {
            number = iterator.next();
            if (number > 20) {
                iterator.remove();
            }
        }

        System.out.println("After removing numbers grater than 20 - " + myCollection2);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);

        System.out.println("Add 3 numbers to myCollection:");
        int position2 = 0;
        for (var el:myCollection) {
            System.out.println("position – " + position2 +
                    ", value of element - " + el);
            position2++;
        }

        myCollection.sort(Comparator.naturalOrder());
        System.out.println("After sorting - " + myCollection);
    }
}
