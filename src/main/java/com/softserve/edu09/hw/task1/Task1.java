package com.softserve.edu09.hw.task1;

import java.util.*;

public class Task1 {
    private Task1() {
        throw new IllegalStateException("Utility class");
    }
    private static final Random RANDOM = new Random();

    public static List<Integer> generateCollection(int size){
        List<Integer> collection = new ArrayList<>();

        for(int i = 0; i < size; ++i){
            collection.add(RANDOM.nextInt(-15, 15));
        }

        return collection;
    }

    public static void swapMaxWithMin(List<Integer> collection){
        int maxIndex = collection.indexOf(Collections.max(collection));
        int minIndex = collection.indexOf(Collections.min(collection));

        int buffer = collection.get(maxIndex);
        collection.set(maxIndex, collection.get(minIndex));
        collection.set(minIndex, buffer);
    }

    public static void insertRandomThreeDigit(List<Integer> collection, int randomNum){
        for(int i = 0; i < collection.size(); ++i){
            if(collection.get(i) < 0){
                collection.add(i, randomNum);
                return;
            }
        }
    }

    public static void insertZero(List<Integer> collection){
        for (int i = 0; i < collection.size() - 1; ++i){
            if(collection.get(i) < 0 && collection.get(i+1) > 0 || collection.get(i) > 0 && collection.get(i+1) < 0){
                collection.add(i+1, 0);
            }
        }
    }

    public static TwoLists copyDirectAndReversOrder(List<Integer> collection, int k){
        List<Integer> directOrder = new ArrayList<>(collection.subList(0, k));
        List<Integer> reversOrder = new ArrayList<>(collection.subList(k, collection.size()));

        Collections.reverse(reversOrder);

        return new TwoLists(directOrder, reversOrder);
    }

    public static void removeLastEvenElement(List<Integer> collection){
        for(int i = collection.size() - 1; i >= 0; --i){
            if(collection.get(i) %2 == 0){
                collection.remove(i);
                return;
            }
        }

        System.out.println("The paired item is not in the collection");
    }

    public static void removeElementFollowingFirstMin(List<Integer> collection){
        int minIndex = collection.indexOf(Collections.min(collection));

        if(minIndex == collection.size() - 1){
            System.out.println("The item cannot be deleted. The minimum item is the last in the collection.");
        }
        else {
            collection.remove(minIndex + 1);
        }
    }
}
