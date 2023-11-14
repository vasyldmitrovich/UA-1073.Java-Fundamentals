package com.softserve.edu09.hw;
import java.util.*;

public class Task1 {
        public static void main(String[] args) {
            // Declare collection myCollection of 10 integers and fill it
            List<Integer> myCollection = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter 10 integers to fill the collection:");
            for (int i = 0; i < 10; i++) {
                myCollection.add(scanner.nextInt());
            }

            int minIndex = myCollection.indexOf(Collections.min(myCollection));
            int maxIndex = myCollection.indexOf(Collections.max(myCollection));
            Collections.swap(myCollection, minIndex, maxIndex);

            int randomThreeDigitNumber = (int) (Math.random() * 900) + 100;
            for (int i = 0; i < myCollection.size(); i++) {
                if (myCollection.get(i) < 0) {
                    myCollection.add(i, randomThreeDigitNumber);
                    break;
                }
            }

            List<Integer> modifiedCollection = new ArrayList<>();
            for (int i = 0; i < myCollection.size() - 1; i++) {
                modifiedCollection.add(myCollection.get(i));
                if (myCollection.get(i) * myCollection.get(i + 1) < 0) {
                    modifiedCollection.add(0);
                }
            }
            modifiedCollection.add(myCollection.get(myCollection.size() - 1));

            int k = 5; // you can change this value as needed
            List<Integer> list1 = new ArrayList<>(myCollection.subList(0, k));
            List<Integer> list2 = new ArrayList<>(myCollection.subList(k, myCollection.size()));
            Collections.reverse(list2);

            for (int i = myCollection.size() - 1; i >= 0; i--) {
                if (myCollection.get(i) % 2 == 0) {
                    myCollection.remove(i);
                    break;
                }
            }

            int firstMinIndex = myCollection.indexOf(Collections.min(myCollection));
            if (firstMinIndex < myCollection.size() - 1) {
                myCollection.remove(firstMinIndex + 1);
            }

            System.out.println("Modified myCollection: " + myCollection);
            System.out.println("Modified Collection with Zeros: " + modifiedCollection);
            System.out.println("List1: " + list1);
            System.out.println("List2 in reverse order: " + list2);

            scanner.close();
        }
    }


