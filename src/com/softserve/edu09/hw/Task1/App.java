package com.softserve.edu09.hw.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-10, 20));
        }

        System.out.println(myCollection);

        int minIndex = myCollection.indexOf(getMinValue(myCollection));
        int maxIndex = myCollection.indexOf(getMaxValue(myCollection));
        if (minIndex >= 0 && maxIndex >= 0) {
            int temp = myCollection.get(minIndex);
            myCollection.set(minIndex, myCollection.get(maxIndex));
            myCollection.set(maxIndex, temp);
        }

        System.out.println(myCollection);

        int randomNum = rnd.nextInt(100, 999);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomNum);
                break;
            }
        }
        System.out.println(myCollection);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int a = 5;
        list1.addAll(myCollection.subList(0, a));

        list2.addAll(myCollection.subList(a, myCollection.size()));
        for (int i = list2.size() - 1; i >= 0; i--) {
            list2.add(list2.get(i));
        }
        list2.subList(0, a).clear();

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            } else {
                System.out.println("The last number isn`t even element");
            }
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(myCollection);

        int min = getMinValue(myCollection);
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) == min) {
                myCollection.remove(i + 1);
                break;
            }
        }

        System.out.println(myCollection);
    }
    private static int getMinValue(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    private static int getMaxValue(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}





