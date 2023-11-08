package com.softserve.edu09.hw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        List<Integer> myCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Введіть 10 цілих чисел:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            myCollection.add(num);
        }


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;

        for (int i = 0; i < myCollection.size(); i++) {
            int num = myCollection.get(i);
            if (num > max) {
                max = num;
                maxIndex = i;
            }
            if (num < min) {
                min = num;
                minIndex = i;
            }
        }

        if (maxIndex != -1 && minIndex != -1) {
            myCollection.set(maxIndex, min);
            myCollection.set(minIndex, max);
        }


        int randomNum = random.nextInt(100, 999);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < 0) {
                myCollection.add(i, randomNum);
                break;
            }
        }

        for (int i = 0; i < myCollection.size() - 1; i++) {
            if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                myCollection.add(i + 1, 0);
            }
        }

        int k = 5;
        List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
        List<Integer> list2 = new LinkedList<>();
        for (int i = myCollection.size() - 1; i >= k; i--) {
            list2.add(myCollection.get(i));
        }

        for (int i = myCollection.size() - 1; i >= 0; i--) {
            if (myCollection.get(i) % 2 == 0) {
                myCollection.remove(i);
                break;
            }
        }

        int firstMinIndex = myCollection.indexOf(min);
        if (firstMinIndex != -1 && firstMinIndex < myCollection.size() - 1) {
            myCollection.remove(firstMinIndex + 1);
        }

        System.out.println("myCollection: " + myCollection);
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
    }
}