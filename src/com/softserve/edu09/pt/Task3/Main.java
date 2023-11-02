package com.softserve.edu09.pt.Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Integer> myCollection = new ArrayList<>();
        var random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(0,30));
        }
        System.out.println(myCollection);
        List <Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println(newCollection);
        myCollection.removeIf(el -> el>20);
        System.out.println(myCollection);
        myCollection.add(1, 1);
        myCollection.add(7, -3);
        myCollection.add(4, -4);
        System.out.println(myCollection);
        Collections.sort(myCollection);
        System.out.println(myCollection);

    }
}
