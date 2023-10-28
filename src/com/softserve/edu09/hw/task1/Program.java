package com.softserve.edu09.hw.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(1000));
        }

        System.out.println("Collection:");
        printCollection(myCollection);


        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        Collections.swap(myCollection, maxIndex, minIndex);

        System.out.println("Swapping");
        printCollection(myCollection);

        int negIndex = myCollection.indexOf(myCollection.stream().filter(x -> x < 0).findFirst().orElse(null));
        if (negIndex != -1) {
            myCollection.add(negIndex, -random.nextInt(900) - 100);
        }

        System.out.println("After inserting a negative number:");
        printCollection(myCollection);


        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) >= 0 && myCollection.get(i + 1) < 0 || myCollection.get(i) < 0 && myCollection.get(i + 1) >= 0) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }

        System.out.println("After inserting zeros:");
        printCollection(myCollection);

        int a = 10;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, a));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(a, myCollection.size()));
        Collections.reverse(list2);

        System.out.println("List1:");
        printCollection(list1);

        System.out.println("List2:");
        printCollection(list2);

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
        }

        System.out.println("After removing the last even element:");
        printCollection(myCollection);

        int firstMinIndex = myCollection.indexOf(Collections.min(myCollection));
        if (firstMinIndex != myCollection.size() - 1) {
            myCollection.remove(firstMinIndex + 1);
        }

        System.out.println("After removing the element following the first minimum:");
        printCollection(myCollection);
    }

    static void printCollection(List<Integer> collection) {
        for (int item : collection) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
