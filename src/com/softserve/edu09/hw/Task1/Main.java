package com.softserve.edu09.hw.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Integer> myCollection = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            myCollection.add(random.nextInt(-10,10));
        }
        System.out.println("Random list:");
        System.out.println(myCollection);
        System.out.println("-".repeat(20));

        int indexMin = myCollection.indexOf( Collections.min(myCollection));
        int indexMax = myCollection.indexOf( Collections.max(myCollection));
        Collections.swap(myCollection, indexMax, indexMin);
        System.out.println("swap min and max");
        System.out.println(myCollection);
        System.out.println("-".repeat(20));
        for (int i = 0; i < myCollection.size(); i++) {
            if(myCollection.get(i) < 0) {
                Random ran = new Random();
                myCollection.add(myCollection.indexOf(myCollection.get(i)),ran.nextInt(100, 999));
                break;
            }
        }
        System.out.println("ad random three-digit number before the first negative element of the list");
        System.out.println(myCollection);
        System.out.println("-".repeat(20));


        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) * myCollection.get(i+1) < 0) {
                myCollection.add(i+1, 0);
                break;
            }
        }
        System.out.println("Insert a zero between all neighboring elements collection myCollection with different signs");
        System.out.println(myCollection);
        System.out.println("-".repeat(20));

               List<Integer> list1 = myCollection.subList(0,myCollection.size()/2);
        List<Integer> list2 = myCollection.subList(myCollection.size()/2,myCollection.size());
        Collections.reverse(list2);
        System.out.println("Copy the first k elements of the myCollection to the list1, in direct order, and the rest to thelist2 in reverse order.");
        System.out.println("List 1");
        System.out.println(list1);
        System.out.println("List 2");
        System.out.println(list2);
        System.out.println("-".repeat(20));

        int lastEven=-1;
            for (int i = 0; i < myCollection.size(); i++) {
                if (myCollection.get(i) % 2 == 0) {
                    lastEven = myCollection.get(i);
                }
            }
            if (lastEven%2 ==0) {
                myCollection.remove((Object) lastEven);
            } else {
                System.out.println("Error");
            }
        System.out.println("remove the last even element");
        System.out.println(myCollection);
        System.out.println("-".repeat(20));


        int min = myCollection.get(0);
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) < min) {
                min = myCollection.get(i);
            }
        }
      if (myCollection.indexOf(min) < myCollection.size()-2) {
            myCollection.remove(myCollection.indexOf(min)+1);
        }
        System.out.println("Remove from the list myCollection the element following the first minimum.");
        System.out.println(myCollection);
        System.out.println("-".repeat(20));
    }
}
