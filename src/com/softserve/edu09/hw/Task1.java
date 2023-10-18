package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    final static Random RANDOM = new Random(10);

    public static void main (String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            myCollection.add(RANDOM.nextInt(-10, 20));
        }

        // task1.1
        swapMinAndMax(myCollection);

        // task1.2
        insertNumBeforeNegative(myCollection);

        // task 1.3
        insertZero(myCollection);

        // task 1.4
        ArrayList<Integer> list1 = getSubArrays(myCollection, 3, false);
        ArrayList<Integer> list2 = getSubArrays(myCollection, 3, true);

        // task 1.5
        removeLastEven(myCollection);

        // task 1.6
        removeNextFromMin(myCollection);
    }

    public static void swapMinAndMax (List<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        var minI = -1;
        var maxI = -1;

        for (int i = 0; i < list.size(); i++) {
            var item = list.get(i);

            if (item < min) {
                min = item;
                minI = i;
            } else if (item > max) {
                max = item;
                maxI = i;
            }
        }

        if (minI != -1) {
            list.set(minI, max);
        }
        if (maxI != -1) {
            list.set(maxI, min);
        }
    }

    public static void insertNumBeforeNegative (List<Integer> list) {
        int num = Task1.getThreeDigitNumber();
        int negativeI = -1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                negativeI = i;
                break;
            }
        }

        if (negativeI != -1) {
            list.set(negativeI, num);
        }
    }

    public static int getThreeDigitNumber () {
        String num = "";

        for (int i = 0; i < 3; i++) {
            int random = RANDOM.nextInt(1, 9);
            num += random;
        }

        return Integer.parseInt(num);
    }

    public static void insertZero (ArrayList<Integer> list) {
        if (list.size() <= 1) return;

        for (int i = 0; i < list.size(); i++) {
            int item = list.get(i);
            if (i == list.size() - 1) {
                break;
            }
            int next = list.get(i + 1);

            if ((item < 0 && next > 0) || (item > 0 && next < 0)) {
                list.add(i + 1, 0);
            }
        }
    }

    public static ArrayList<Integer> getSubArrays (ArrayList<Integer> list, int k, boolean reverse) {
        if (list.size() <= k) return list;

        ArrayList<Integer> subList = new ArrayList<>();

        if (reverse) {
            for (int i = list.size() - 1; i >= k; i--) {
                subList.add(list.get(i));
            }
        } else {
            for (int i = 0; i < k; i++) {
                subList.add(list.get(i));
            }
        }

        return subList;
    }

    public static void removeLastEven (ArrayList<Integer> list) {
        if (list.size() <= 1) return;

        int evenI = -1;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                evenI = i;
                break;
            }
        }

        if (evenI == -1) {
            System.out.println("There is no even item");
        } else {
            list.remove(evenI);
        }
    }

    public static void removeNextFromMin (List<Integer> list) {
        if (list.size() <= 1) return;
        int minI = 0;
        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            int item = list.get(i);
            if (item < min && min != item) {
                minI = i;
                min = item;
            }
        }

        if (minI == list.size() - 1) {
            return;
        }

        list.remove(minI + 1);
    }
}
