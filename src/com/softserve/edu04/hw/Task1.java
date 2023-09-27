package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task1 {
    private static final int LEFT_BORDER = -5;
    private static final int RIGHT_BORDER = 5;
    private static final int MAX_COUNT_NUM = 3;

    public static void checkNumberForRange(){
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < MAX_COUNT_NUM; ++i){
            System.out.printf("Enter number #%d: ", i + 1);
            int num = scanner.nextInt();

            if(LEFT_BORDER <= num && num <= RIGHT_BORDER){
                ++count;
            }
        }

        System.out.printf("Range [%d; %d] belong to %d numbers out of %d.\n", LEFT_BORDER, RIGHT_BORDER, count, MAX_COUNT_NUM);
    }
}
