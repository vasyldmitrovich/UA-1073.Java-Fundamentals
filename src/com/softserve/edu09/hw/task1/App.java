package com.softserve.edu09.hw.task1;

import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>();
        var rand = new Random();
        var threerand = new Random();

        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(-5,5));
        }
        System.out.println("myCollection v.1");
        System.out.println(myCollection);

        int maxNum = myCollection.indexOf(Collections.max(myCollection));
        int minNum = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection,maxNum,minNum);
        System.out.println("myCollection v.2");
        System.out.println(myCollection);

        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i) < 0){
                myCollection.add(i,threerand.nextInt(100,999));
                break;
            }
        }
        System.out.println("myCollection v.3");
        System.out.println(myCollection);

        ArrayList<Integer> modifiedCollection = new ArrayList<>();
        if (!myCollection.isEmpty()) {
            modifiedCollection.add(myCollection.get(0));
        }
        for (int i = 1; i < myCollection.size(); i++) {
            int currentElement = myCollection.get(i);
            int previousElement = myCollection.get(i - 1);
            if ((currentElement > 0 && previousElement < 0) || (currentElement < 0 && previousElement > 0)) {
                modifiedCollection.add(0);
            }
            modifiedCollection.add(currentElement);
        }
        System.out.println("modidfiedCollection");
        System.out.println(modifiedCollection);

        ArrayList<Integer> firstCollection = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            firstCollection.add(myCollection.get(i));
        }
        System.out.println("first 5 numbers of my collection");
        System.out.println(firstCollection);

        ArrayList<Integer> secondCollection = new ArrayList<>();
        for (int i = 10; i > 5; --i) {
            secondCollection.add(myCollection.get(i));
        }
        System.out.println("lust 5 numbers of my collection");
        System.out.println(secondCollection);
        System.out.println(myCollection);


        int lastIndexToRemove = -1;
        for (ListIterator<Integer> iterator = myCollection.listIterator(); iterator.hasNext(); ) {
            int element = iterator.next();
            if (element % 2 == 0) {
                lastIndexToRemove = iterator.nextIndex() - 1;
            }
        }
        if (lastIndexToRemove != -1) {
            myCollection.remove(lastIndexToRemove);
            System.out.println("Last even element removed.");
        } else {
            System.out.println("No even elements to remove.");
        }

        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minIndex != myCollection.size() - 1) {
            myCollection.remove(minIndex + 1);
            System.out.println("Element following the first minimum removed.");
        }else {
            System.out.println("No element to remove after the first minimum.");
        }
        System.out.println(myCollection);
    }
}
