package com.softserve.edu09.pt.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Викликаємо ваш метод
        Task3();
    }

    public static void Task3() {
        List<Integer> myCollection = new ArrayList<>();
        var random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(30));
        }
        System.out.println("All list: " + myCollection);

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }
        System.out.println("Index of digits greater than five: " + newCollection);

        myCollection.removeIf(el -> el > 20);
        System.out.println("List without numbers greater than twenty: " + myCollection);

        myCollection.sort(null);
        System.out.println("Sorted list: " + myCollection);
    }
}
