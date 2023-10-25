package com.softserve.edu09.hw.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Random rand = new Random();

        // Fill the collection with 10 random integers
        for (int i = 0; i < 10; i++) {
            myCollection.add(rand.nextInt(1000));
        }

        System.out.println("Original Collection: " + myCollection);

        int maxIndex = myCollection.indexOf(CollectionUtils.findMax(myCollection));
        int minIndex = myCollection.indexOf(CollectionUtils.findMin(myCollection));

        if (maxIndex >= 0 && minIndex >= 0) {
            ListOperations.swapElements(myCollection, maxIndex, minIndex);
        }

        int negativeIndex = myCollection.indexOf(CollectionUtils.findFirstNegative(myCollection));

        if (negativeIndex >= 0) {
            int randomThreeDigitNumber = rand.nextInt(900) + 100; // Random 3-digit number
            myCollection.add(negativeIndex, randomThreeDigitNumber);
        }

        // Insert a zero between all neighboring elements with different signs
        ListOperations.insertZerosBetweenNeighbors(myCollection);

        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, 5)); // Change 5 to your desired value of k
        List<Integer> list2 = new ArrayList<>(myCollection.subList(5, myCollection.size()));

        ListOperations.reverseList(list2);

        ListOperations.removeEvenNumbers(myCollection);

        System.out.println("Modified Collection: " + myCollection);
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
    }
}
