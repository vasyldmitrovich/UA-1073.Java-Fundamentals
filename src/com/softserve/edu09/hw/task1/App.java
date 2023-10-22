package com.softserve.edu09.hw.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random rnd = new Random(5);
        List<Integer> myCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            myCollection.add(rnd.nextInt(-10, 50));
        }
        System.out.println(myCollection);

        int minIdx = getIndexOfMinElement(myCollection);
        int maxIdx = getIndexOfMaxElement(myCollection);
        swap(myCollection, minIdx, maxIdx);
        System.out.println("\nList after swapping:");
        System.out.println(myCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                for (int j = 0; j < 3; j++) {
                    myCollection.add(i, rnd.nextInt(-10, 50));
                }
                break;
            }
        }
        System.out.println("\nList after adding three-digit number before first negative number: ");
        System.out.println(myCollection);


        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            }
        }

        System.out.println("\nList after adding zero between elements with different signs: ");
        System.out.println(myCollection + "\n");

        int k = 10;
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            list1.add(myCollection.get(i));
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }
        System.out.println("List1 with first %d elements in direct order: ".formatted(k));
        System.out.println(list1);
        System.out.println("List2 with the rest elements in direct order: ");
        System.out.println(list2 + "\n");

        boolean deleted = false;
        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                System.out.println("Last even element deleted.\nCurrent list:");
                System.out.println(myCollection + "\n");
                deleted = true;
                break;
            }
        }
        if (!deleted) {
            System.out.println("List doesn`t contains even elements.\n");
        }

        minIdx = getIndexOfMinElement(myCollection);
        if (minIdx + 1 == myCollection.size()) {
            System.out.println("Nothing needs to remove.");
        } else {
            myCollection.remove(minIdx + 1);
            System.out.println("Next element after minimum was removed.");
        }
        System.out.println("Current list:");
        System.out.println(myCollection + "\n");

    }

    public static void swap(List<Integer> list, Integer a, Integer b) {
        Integer temp = list.get(a);
        list.set(a, list.get(b));
        list.set(b, temp);
    }

    public static int getIndexOfMinElement(List<Integer> list) {
        int min = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(min) > list.get(i)) {
                min = i;
            }
        }
        return min;
    }

    public static int getIndexOfMaxElement(List<Integer> list) {
        int max = 0;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(max) < list.get(i)) {
                max = i;
            }
        }
        return max;
    }
}
