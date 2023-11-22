package com.softserve.edu09.hw;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>(Arrays.asList(3, -1, 8, 9, -2, 2, -5, 7, 9, -6));


        int maxIndex = myCollection.indexOf(Collections.max(myCollection));
        int minIndex = myCollection.indexOf(Collections.min(myCollection));

        Collections.swap(myCollection, maxIndex, minIndex);

        int randomThreeDigitNumber = (int) (Math.random() * 900 + 100);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomThreeDigitNumber);
                break;
            }
        }
        for (int i = 0; i < myCollection.size() - 1; i++) {
            if ((myCollection.get(i) < 0 && myCollection.get(i + 1) > 0) ||
                    (myCollection.get(i) > 0 && myCollection.get(i + 1) < 0)) {
                myCollection.add(i + 1, 0);
                i++;
            }
        }

        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
        Collections.reverse(list2);

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
        }


        int minElement = Collections.min(myCollection);
        int minIndex2 = myCollection.indexOf(minElement);
        if (minIndex2 < myCollection.size() - 1) {
            myCollection.remove(minIndex2 + 1);
        } else {
            System.out.println("Немає елемента для видалення.");
        }

        // Вивести оновлену колекцію myCollection
        System.out.println("Оновлена колекція myCollection: " + myCollection);
        System.out.println("Список1: " + list1);
        System.out.println("Список2: " + list2);
    }
}