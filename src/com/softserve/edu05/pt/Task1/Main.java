package com.softserve.edu05.pt.Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Create a string array and sort it.
        String[] strings = {"Anna", "Marta", "Bob", "Mark"};
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        //Create an array with 5 elements and calculate the average value
        int[] arr = {10,20,3,4,5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        double avarage = sum / (double) arr.length;
        System.out.println("Avarage is %.2f".formatted(avarage) );

        //Сheck if the array (any of the previous ones) contains the value ( value enter from the
        //console). Output the result of the search
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("input the number");
        int index = Arrays.binarySearch(arr, scanner.nextInt());
        System.out.println("Index of searching number is " + index);






    }

}
