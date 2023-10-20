package com.softserve.edu09.hw;

import java.util.*;

class Hw1 {

    static void swapMaxAndMin(List<Integer> list) {

        int max = list.get(0);
        int maxPosition = 0;
        int min = list.get(0);
        int minPosition = 0;
        int count = 0;

        for (var el : list) {
            if (el > max) {
                max = el;
                maxPosition = count;
            }
            if (el < min) {
                min = el;
                minPosition = count;
            }
            count++;
        }

        list.remove(minPosition);
        list.add(minPosition, max);
        list.remove(maxPosition);
        list.add(maxPosition, min);

        // alternative code

//        int tempMin;
//        int tempMax;
//        List<Integer> listSorted = new LinkedList<>();
//        listSorted.addAll(list);
//        listSorted.sort(Comparator.naturalOrder());
//
//        tempMin = listSorted.get(0);
//        listSorted.remove(0);
//
//        listSorted.add(tempMin);
//        tempMax = listSorted.get(listSorted.size() - 2);
//        listSorted.add(0, tempMax);
//
//        list.clear();
//        list.addAll(listSorted);
    }

    static void setThreeDigitNumberBeforeMin(List<Integer> list) {
        Random random = new Random();
        int minPosition = 0;
        int count = 0;

        for (var el : list) {
            if (el < 0) {
                minPosition = count;
                break;
            }
            count++;
        }

        list.add(minPosition, random.nextInt(100, 999));
    }

    public static void insertZeroBetweenAllElementsWithDifferentSigns(List<Integer> myCollection) {
        Iterator<Integer> iterator = myCollection.iterator();

        int previous = iterator.next();
        int next;
        List<Integer> temp = new LinkedList<>();
        temp.add(previous);
        while (iterator.hasNext()) {
            next = iterator.next();
            if ((previous < 0 && next > 0) || (previous > 0 && next < 0)) {
                temp.add(0);
            }
            previous = next;
            temp.add(next);
        }
        myCollection.clear();
        myCollection.addAll(temp);
    }

    public static List<Integer> copyWithRule(List<Integer> myCollection, int k) {
        LinkedList<Integer> temp = new LinkedList<>(myCollection);
        temp.subList(0,k).sort(Comparator.naturalOrder());
        temp.subList(k, myCollection.size()).sort(Comparator.reverseOrder());
        return temp;
    }

    public static void removeLastEvenElement(List<Integer> myCollection) {
        Iterator<Integer> iterator = ((LinkedList)myCollection).descendingIterator();
        int position = myCollection.size() - 1;
        int next = 0;
        while (iterator.hasNext()) {
            next = iterator.next();
            if ( next% 2 == 0 && next !=0) {
                myCollection.remove(position);
                break;
            }
            position--;
        }
        if (next == 0) {
            System.out.println("There's no even numbers in our list");
        }
    }

    public static void removeElementFollowingTheFirstMinimum(List<Integer> myCollection) {
        int firstMinimum;
        List<Integer> list = new LinkedList<>(myCollection);
        list.sort(Comparator.naturalOrder());
        firstMinimum = list.get(0);
        if (myCollection.indexOf(firstMinimum) != myCollection.size() - 1) {
            myCollection.remove(myCollection.indexOf(firstMinimum) + 1);
            System.out.println("After removing element following the first minimum:\n" + myCollection);
        }
    }
}
