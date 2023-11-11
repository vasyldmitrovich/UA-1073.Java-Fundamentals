package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> myCollection = new ArrayList<>();
        System.out.println("Enter 10 integers to fill the collection:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            myCollection.add(num);
        }

        int minIndex = myCollection.indexOf(Collections.min(myCollection));
        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        Collections.swap(myCollection, minIndex, maxIndex);

        int randomThreeDigitNumber = new Random().nextInt(900) + 100;
        int firstNegativeIndex = myCollection.indexOf(myCollection.stream().filter(x -> x < 0).findFirst().orElse(null));
        if (firstNegativeIndex != -1) {
            myCollection.add(firstNegativeIndex, randomThreeDigitNumber);
        }

        List<Integer> updatedCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size() - 1; i++) {
            updatedCollection.add(myCollection.get(i));
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                updatedCollection.add(0);
            }
        }
        updatedCollection.add(myCollection.get(myCollection.size() - 1));

        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        int lastEvenIndex = -1;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }

        if (lastEvenIndex != -1) {
            myCollection.remove(lastEvenIndex);
        } else {
            System.out.println("No even element to remove.");
        }

        int minElementIndex = myCollection.indexOf(Collections.min(myCollection));
        if (minElementIndex != myCollection.size() - 1) {
            myCollection.remove(minElementIndex + 1);
        }

        System.out.println("Final myCollection:");
        System.out.println(myCollection);
    }
}

