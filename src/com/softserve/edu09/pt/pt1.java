package com.softserve.edu09.pt;

import java.util.*;

class HeavyBox {
    int weight;
    private String contents;

    public HeavyBox(int weight, String contents) {
        this.weight = weight;
        this.contents = contents;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", contents='" + contents + '\'' +
                '}';
    }
}

public class pt1 {
    public static void main(String[] args) {
        List<HeavyBox> boxes = new ArrayList<>();
        boxes.add(new HeavyBox(10, "Books"));
        boxes.add(new HeavyBox(15, "Tools"));
        boxes.add(new HeavyBox(20, "Electronics"));

        System.out.println("Initial contents of the boxes:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        if (!boxes.isEmpty()) {
            boxes.get(0).weight += 1;
        }

        if (!boxes.isEmpty()) {
            boxes.remove(boxes.size() - 1);
        }

        System.out.println("\nAfter modifying the first box and removing the last box:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        boxes.clear();
        System.out.println("\nAfter removing all boxes:");
        for (HeavyBox box : boxes) {
            System.out.println(box);
        }

        String userInput = "1, 2, 3, 4, 4, 5, 6, 6, 7, 8";
        String[] numbers = userInput.split(", ");
        Set<String> uniqueNumbers = new LinkedHashSet<>(Arrays.asList(numbers));

        System.out.println("\nAfter removing duplicate elements:");
        System.out.println(String.join(", ", uniqueNumbers));

        List<Integer> myCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 integers to fill myCollection:");
        for (int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            myCollection.add(num);
        }

        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(i);
            }
        }

        System.out.println("\nPositions of elements more than 5 in myCollection: " + newCollection);

        myCollection.removeIf(value -> value > 20);

        System.out.println("\nAfter removing elements greater than 20:");
        System.out.println(myCollection);

        int[] insertValues = {1, -3, -4};
        int[] insertPositions = {2, 8, 5};

        for (int i = 0; i < insertValues.length; i++) {
            int position = insertPositions[i];
            int value = insertValues[i];
            myCollection.add(position, value);
            System.out.println("Position - " + position + ", Value of element - " + value);
        }

        System.out.println("\nAfter inserting elements at specified positions:");
        System.out.println(myCollection);
        Collections.sort(myCollection);
        System.out.println("\nAfter sorting myCollection:");
        System.out.println(myCollection);
    }
}

