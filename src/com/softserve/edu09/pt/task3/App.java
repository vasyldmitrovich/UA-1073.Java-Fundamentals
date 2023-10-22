package com.softserve.edu09.pt.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rnd = new Random(5);
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(0, 50));
        }
        System.out.println(myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }

        System.out.println("\nnewCollection:");
        System.out.println(newCollection);

        myCollection.removeIf(el -> el > 20);
        System.out.println("\nmyCollection without elements > 20");
        System.out.println(myCollection + "\n");

        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(0, 50));
        }
        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.printf("position - %d, value of element - %d\n", i, myCollection.get(i));
        }


        Collections.sort(myCollection);
        System.out.println("\nSorted list:");
        System.out.println(myCollection);
    }

}
