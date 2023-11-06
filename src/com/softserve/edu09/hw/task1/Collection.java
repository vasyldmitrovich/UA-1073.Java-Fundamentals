package com.softserve.edu09.hw.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Collection {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        var random = new Random();

        for (int i = 0; i < 10; i++) {
            myList.add(random.nextInt(-9, 10));
        }
        System.out.println(myList + " --> Original list.");

        int maxIndex = myList.indexOf(Collections.max(myList));
        int minIndex = myList.indexOf(Collections.min(myList));
        Collections.swap(myList, maxIndex, minIndex);
        System.out.println(myList + " --> Swap min/max number.");

        var randomThirty = new Random();
        int random3 = randomThirty.nextInt(100, 999);

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < 0) {
                myList.add(i, random3);
                break;
            }
        }
        System.out.println(myList + " --> Add a three-digit number before the first negative.");

        for (int i = 0; i < myList.size() - 1; i++) {
            if (myList.get(i) * myList.get(i + 1) < 0) {
                myList.add(i + 1, 0);
            }
        }
        System.out.println(myList + " --> Insert a zero between equivalent numbers.");

        int k = 5;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list1.add(myList.get(i));
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i = myList.size() - 1; i >= k; i--) {
            list2.add(myList.get(i));
        }
        System.out.println(list1 + " --> First five elements.");
        System.out.println(list2 + " --> Other items from the list.");

        for (int i = 0; i < myList.size() - 1; i--) {
            if (myList.get(i) % 2 == 0) {
                myList.remove(i);
            } else {
                System.out.println("No paired elements");
            }
            break;
        }
        System.out.println(myList);

        int min = Collections.min(myList);
        int minIndex2 = myList.indexOf(min);
        if (minIndex2 < myList.size() - 1) {
            myList.remove(minIndex2 + 1);
        } else {
            System.out.println("Nothing to remove.");
        }
        System.out.println(myList + " --> The first element is removed by the minimum.");


    }
}

