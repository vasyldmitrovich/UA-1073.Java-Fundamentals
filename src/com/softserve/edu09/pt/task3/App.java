package com.softserve.edu09.pt.task3;

import java.util.*;

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
            if (myCollection.get(i) > 5){
                newCollection.add(i);
            }
        }
        System.out.println(newCollection);
      //  myCollection.removeIf(el -> el > 20);
        var it = myCollection.iterator();
        while (it.hasNext()){
            if(it.next()>20){
                it.remove();
            }

        }
        System.out.println(myCollection);
        myCollection.sort(null); // instead of comparator
        System.out.println(myCollection);


    }
}
