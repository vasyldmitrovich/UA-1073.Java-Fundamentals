package com.softserve.edu09.task1;

import java.util.*;

public class App {

    private static final Random random = new Random();
    private static final List<Integer> myCollection = new ArrayList<>();

    public static void main(String[] args) {

        fillCollection(myCollection);
        swapMaxAndMin();

        insertBeforeNegative();


        insertBetweenPositiveAndNegative();

        copyElements(5);

        deleteLastEvenNumber();

        deleteMinimumFollowing();

    }
    public static void fillCollection(List<Integer> array) {

        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(-50, 50));
        }
    }
    public static void swapMaxAndMin() {
        List<Integer> array = new ArrayList<>(myCollection);
        System.out.println("Task 1");
        System.out.println(array);

        int min = array.get(1);
        int max = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > max) {
                max = array.get(i);
            } else if (array.get(i) < min) {
                min = array.get(i);
            }
        }

        Collections.swap(array, array.indexOf(max), array.indexOf(min));
        System.out.println(array);
    }
    public static void insertBeforeNegative() {
        List<Integer> array = new ArrayList<>(myCollection);
        System.out.println("Task 2");
        int counter = 0;
        for (int i = 0; i < array.size() -1; i++) {
            if (array.get(i+1) < 0) {
                counter++;
                if (counter==1) {
                    array.add(i, random.nextInt(99, 1000));
                }
            }

        }
        System.out.println(array);
    }

    public static void insertBetweenPositiveAndNegative() {
        List<Integer> array = new ArrayList<>(myCollection);
        System.out.println("Task 3");
        for (int i = 0; i < array.size()-1; i++) {
            if ((array.get(i) > 0 && array.get(i + 1) < 0) || (array.get(i) < 0 && array.get(i + 1) > 0)) {
                array.add(i+1, 0);
            }
        }
        System.out.println(array);
    }
    public static void copyElements(int k) {
        List<Integer> array = new ArrayList<>(myCollection);
        System.out.println("Task 4");
        List<Integer> list1 = new ArrayList<>(array.subList(0, k));
        List<Integer> list2 = new ArrayList<>(array.subList(k, array.size()));
        Collections.reverse(list2);

        System.out.println(list1);
        System.out.println(list2);
    }
    public static void deleteLastEvenNumber() {
        List<Integer> array = new ArrayList<>(myCollection);

        System.out.println("Task 5");
        System.out.println(array);

        int index = 0;
        int counter = 0;
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                counter++;
                List<Integer> temp = new ArrayList<>(array.subList(i, array.size()));
                for (int j = 0; j < temp.size(); j++) {
                    if (temp.get(j) % 2 == 0) {
                        if (i > j) {
                            index = i;
                        } else if (i < j) {
                            index = j;
                        }
                    }
                }
            }

        }
        if (counter == 0) {
            System.out.println("In list there are no even numbers.");
        } else {
            array.remove(index);
        }

        System.out.println(array);

    }
    public static void deleteMinimumFollowing() {
        List<Integer> array = new ArrayList<>(myCollection);


        System.out.println("Task 6");
        System.out.println(array);

        int minPosition = array.indexOf(Collections.min(array));

        if (minPosition != array.size()-1) {
            array.remove(minPosition+1);
        }

        System.out.println(array);
    }
}
