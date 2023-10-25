package com.softserve.edu09.hw.Task1;

import java.util.List;

public class ListOperations {
    public static void swapElements(List<Integer> list, int index1, int index2) {
        if (index1 >= 0 && index2 >= 0 && index1 < list.size() && index2 < list.size()) {
            int temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        }
    }

    public static void insertZerosBetweenNeighbors(List<Integer> list) {
        for (int i = 1; i < list.size(); i++) {
            int prev = list.get(i - 1);
            int current = list.get(i);
            if ((prev > 0 && current < 0) || (prev < 0 && current > 0)) {
                list.add(i, 0);
                i++;
            }
        }
    }

    public static void reverseList(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
    }

    public static void removeEvenNumbers(List<Integer> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
