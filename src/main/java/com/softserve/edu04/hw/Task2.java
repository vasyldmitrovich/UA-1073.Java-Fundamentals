package com.softserve.edu04.hw;

import java.util.Scanner;

public class Task2 {
    private static final int MAX_COUNT_NUM = 3;

    public static void searchMinAndMaxNum(){
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < MAX_COUNT_NUM; ++i){
            System.out.printf("Enter number #%d: ", i + 1);
            int num = scanner.nextInt();

            if(num < min){
                min = num;
            }

            if(num > max){
                max = num;
            }
        }

        System.out.printf("Among the numbers you have given, the smallest is %d, and the largest is %d.\n", min, max);
    }
}
