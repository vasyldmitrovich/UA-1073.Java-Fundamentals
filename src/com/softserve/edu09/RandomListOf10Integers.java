package com.softserve.edu09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomListOf10Integers {

    public static List<Integer> createAndFillRandomLinkedList(int length, int origin, int bound) {
        Random random = new Random();

        List<Integer> collection = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            collection.add(random.nextInt(origin, bound));
        }
        return collection;
    }

    public static ArrayList<Integer> createAndFillRandomArrayList(int length, int origin, int bound) {
        Random random = new Random();

        ArrayList<Integer> collection = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            collection.add(random.nextInt(origin, bound));
        }
        return collection;
    }

    public static ArrayList<Integer> fill(){
        return createAndFillRandomArrayList(10,1,6);
    }
}
