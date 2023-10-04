package com.softserve.edu05.pt.task1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        //Task 1_1
        String[] mas = {"One", "Two", "Three", "Four", "Five"};
        System.out.println(Arrays.toString(mas));
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        //Task 1_2
        double average = 0;
        int[] mas1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < mas1.length; i++) {
            average += mas1[i];
        }
        System.out.println("Average int: " + average / mas.length);
        //Task 1_3
        int[] mas2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Input number that you want to find from 1 to 10");
        int findNumber = scanner.nextInt();
        boolean found = contains(mas2,findNumber);
        System.out.println(found ? + findNumber + " is present" : + findNumber + " isnt present");
    }
    static boolean contains(int[] mas2, int el){
        for (int num : mas2){
            if (num == el){
                return true;
            }
        }
        return false;
    }
}
