package com.softserve.edu09.pt.task3;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer>  myCollection = new ArrayList<>();
        var rand = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(0,30));
        }
        System.out.println(myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i) > 5){
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);

        myCollection.removeIf(el -> el > 20);
        System.out.println(myCollection);

        myCollection.add(2,-1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);
        System.out.println(myCollection);

        myCollection.sort(null);
        System.out.println(myCollection);
    }
}
