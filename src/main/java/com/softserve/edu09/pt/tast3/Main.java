package com.softserve.edu09.pt.tast3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        List<Integer> myCollection = generateCollection(10);
        System.out.printf("Original collection: %s%n", myCollection);

        List<Integer> newCollection = findPositionsElementMoreThanFive(myCollection);
        System.out.printf("Element indices greater than 5: %s%n", newCollection);

        List<Integer> withoutMoreTwenty = deleteElementGreaterThenTwenty(myCollection);
        System.out.printf("A collection of numbers that are less than or equal to 20: %s%n", withoutMoreTwenty);

        List<Integer> newUpdateList = insertNewElement(myCollection);
        System.out.printf("MyCollection with additional elements: %s%n", newUpdateList);

        myCollection.sort(Comparator.naturalOrder());
        System.out.printf("Sorted items of the myCollection collection: %s%n", myCollection);
    }

    private static List<Integer> generateCollection(int size){
        List<Integer> collection = new ArrayList<>();

        for(int i = 0; i < size; ++i){
            collection.add(RANDOM.nextInt(0, 30));
        }

        return collection;
    }

    private static List<Integer> findPositionsElementMoreThanFive(List<Integer> collection){
        List<Integer> newCollection = new ArrayList<>();

        for(int i = 0; i < collection.size(); ++i){
            if(collection.get(i) > 5){
                newCollection.add(i);
            }
        }
        return newCollection;
    }

    private static List<Integer> deleteElementGreaterThenTwenty(List<Integer> collection){
        List<Integer> copyCollection = new ArrayList<>(List.copyOf(collection));
        copyCollection.removeIf(el -> el > 20);
        return copyCollection;
    }

    private static List<Integer> insertNewElement(List<Integer> collection){
        List<Integer> copyCollection = new ArrayList<>(List.copyOf(collection));

        copyCollection.set(2, 1);
        copyCollection.set(8, -3);
        copyCollection.set(5, -4);

        return copyCollection;
    }
}
