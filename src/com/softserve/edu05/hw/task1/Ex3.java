package com.softserve.edu05.hw.task1;

import java.util.Arrays;
import java.util.Random;

public class Ex3 {//All is good
    public static void main(String[] args) {
        Random rrr = new Random();
        int[] fiveNum = rrr.ints(5, -3, 4).toArray();
        System.out.println(Arrays.toString(fiveNum));

        int indexOfNum = findSecondPositive(fiveNum);

        System.out.println("The index of second positive numbers is: " + indexOfNum);

    }

    public static int findSecondPositive(int[] fiveNum) {
        int index = -1;
        int positiveCounter = 0;

        for (int i = 0; i < fiveNum.length; i++) {
            if (fiveNum[i] > 0) {
                positiveCounter++;
            }

            if (positiveCounter == 2) {
                index = i;
                break;
            }
        }

        return index;
    }
}
