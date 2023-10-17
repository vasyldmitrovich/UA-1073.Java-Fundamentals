package com.softserve.edu09.hw.task01;

import java.util.*;

public class App {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        var rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(2001) - 1000);
        }
        System.out.println(myCollection);
        printDelimiterMessage("Swapping minimal and maximal elements in this list");
        Integer tmp = myCollection.get(collectionMinIndex(myCollection));
        myCollection.set(collectionMinIndex(myCollection), myCollection.get(collectionMaxIndex(myCollection)));
        myCollection.set(collectionMaxIndex(myCollection), tmp);
        System.out.println(myCollection);
        printDelimiterMessage("Inserting three digits random number before the first negative element of the list");
        if (collectionFirstNegativeIndex(myCollection) >= 0) {
            int randomInt = rnd.nextInt(1800);
            randomInt = randomInt < 900 ? randomInt + 100 : randomInt - 1899;
            myCollection.add(collectionFirstNegativeIndex(myCollection), randomInt);
            System.out.println(myCollection);
        } else {
            System.out.println("There are no negative numbers in this collection");
        }
        printDelimiterMessage("Inserting 0 between all neighboring elements collection with different signs");
        int maxIndex = myCollection.size() - 2;
        for (int i = 0; i <= maxIndex; i++) {
            if ((myCollection.get(i) > 0 && myCollection.get(i + 1) < 0) ||
                    (myCollection.get(i) < 0 && myCollection.get(i + 1) > 0)) {
                myCollection.add(i + 1, 0);
                maxIndex++;
                i++;
            }
        }
        System.out.println(myCollection);
        var console = new Scanner(System.in);
        int k;
        String message = "";
        System.out.println("Enter k value from 0 to " + myCollection.size());
        do {
            k = console.nextInt();
        } while (k < 0 || k > myCollection.size());
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        if (k != 0) {
            message = "Copying first " + k + " elements to list1, in direct order";
            for (int i = 0; i < k; i++) {
                list1.add(myCollection.get(i));
            }
        }

        if (k != myCollection.size()) {
            message += message.isEmpty() ? "" : ". ";
            message += "Copying elements from index " + k + " to " + (myCollection.size() - 1) + " to list2, in reverse order";
            for (int i = myCollection.size() - 1; i >= k; i--) {
                list2.add(myCollection.get(i));
            }
        }
        printDelimiterMessage(message);
        System.out.println(list1.isEmpty() ? "List 1 is empty" : list1);
        System.out.println(list2.isEmpty() ? "List 2 is empty" : list2);
        printDelimiterMessage("Removing the last even element in collection");
        if (collectionLastEvenIndex(myCollection) >= 0) {
            myCollection.remove(collectionLastEvenIndex(myCollection));
            System.out.println(myCollection);
        } else {
            System.out.println("There are no even elements in collection");
        }
        printDelimiterMessage("Removing the element after the first minimal");
        if (collectionMinIndex(myCollection) != myCollection.size() - 1) {
            myCollection.remove(collectionMinIndex(myCollection) + 1);
            System.out.println(myCollection);
        } else {
            System.out.println("The minimal element is the last in collection");
        }
    }

    public static void printDelimiterMessage(String message) {
        System.out.println("=".repeat(message.length()));
        System.out.println(message);
        System.out.println("=".repeat(message.length()));
    }

    public static int collectionMinIndex(List<Integer> collection) {
        int minValue = collection.get(0);
        int minIndex = 0;
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < minValue) {
                minValue = collection.get(i);
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int collectionMaxIndex(List<Integer> collection) {
        int maxValue = collection.get(0);
        int maxIndex = 0;
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) > maxValue) {
                maxValue = collection.get(i);
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int collectionFirstNegativeIndex(List<Integer> collection) {
        int firstNegativeIndex = -1;
        for (int i = 0; i < collection.size(); i++) {
            if (collection.get(i) < 0) {
                firstNegativeIndex = i;
                break;
            }
        }
        return firstNegativeIndex;
    }

    public static int collectionLastEvenIndex(List<Integer> collection) {
        int lastEvenIndex = -1;
        for (int i = collection.size() - 1; i >= 0; i--) {
            if (collection.get(i) % 2 == 0) {
                lastEvenIndex = i;
                break;
            }
        }
        return lastEvenIndex;
    }
}
