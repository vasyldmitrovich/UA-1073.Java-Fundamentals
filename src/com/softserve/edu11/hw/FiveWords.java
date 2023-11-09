package com.softserve.edu11.hw;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class FiveWords {

    private static String[] original;
    private static String[] originalSortedInReverseOrderByLength;

    static {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Hello. Please input sentence minimum 5 words long (please use latin letters or/and numbers:");
            original = sc.nextLine().split("\\W+");
            originalSortedInReverseOrderByLength = original.clone();
            Arrays.sort(originalSortedInReverseOrderByLength, new Comparator<>() {
                @Override
                public int compare(String o1, String o2) {
                    return Integer.compare(o2.length(), o1.length());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Something goes wrong. Contact with developer please.");
        }
    }

    public static void theLongestWord() {
        System.out.println("The longest words is - " + originalSortedInReverseOrderByLength[0]);
    }

    public static void theLongestWordLength() {
        System.out.println("The longest word length - " + originalSortedInReverseOrderByLength[0].length());
    }

    public static void secondWordInReverseOrder(){
        System.out.println(new StringBuilder(original[1]).reverse());
    }
}
