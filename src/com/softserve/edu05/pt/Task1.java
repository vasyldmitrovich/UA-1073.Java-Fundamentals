package com.softserve.edu05.pt;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main() {

        Scanner scanner = new Scanner(System.in);

        String[] arraySort = {"Red", "Blue", "Green", "Pink", "Black"};
        Arrays.sort(arraySort);
        System.out.println(Arrays.toString(arraySort));

        int[] numSort = {6, 3, 5, 3, 1};
        double average = averageValue(numSort);
        System.out.println("Average is: " + average);

        System.out.println("Input your number to check:");
        int textNumb = scanner.nextInt();
        boolean check = chekcNumb(numSort, textNumb);
        if (check){
            System.out.println("Number " + textNumb + " is in array.");
        } else {
            System.out.println("Number " + textNumb + " isn`t in array.");
        }

    }
    public static double averageValue (int[] numSort) {
        int sum = 0;
        for (int i = 0; i < numSort.length; i++) {
            sum += numSort[i];
        }
        return (double) sum / numSort.length;
    }

    public static boolean chekcNumb (int[] numSort, int textNumb) {
        for (int b = 0; b < numSort.length; b++) {
            if (numSort[b] == textNumb) {
                return true;
            }
        } return false;
    }
}
