package com.softserve.edu05.hw;

import java.util.Scanner;
import java.util.SortedMap;

public class Task1_3 {
    public static void run() {
        int[] numbers = new int[5];
        Scanner console = new Scanner(System.in);
        int secondPos = -2;
        int minValue = Integer.MAX_VALUE;
        int minIndex = 0;
        int evenProduct = 1;
        System.out.println("Enter 5 integer numbers");
        for (int i = 0; i < 5; i++) {
            numbers[i] = console.nextInt();
            console.nextLine();
            secondPos = numbers[i] > 0 && secondPos == -1 ? i : secondPos;
            secondPos = numbers[i] > 0 && secondPos == -2 ? -1 : secondPos;
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                minIndex = i;
            }
            evenProduct *= numbers[i] != 0 && numbers[i] % 2 == 0 ? numbers[i] : 1;
        }
        System.out.println(secondPos >= 0 ? ("Second positive index is " + secondPos) : secondPos == -1 ? "Only 1 positive!" : "No positive!");
        System.out.println("Minimum value is " + minValue + " at index " + minIndex);
        System.out.println("The product of even numbers is " + evenProduct);
    }
}
