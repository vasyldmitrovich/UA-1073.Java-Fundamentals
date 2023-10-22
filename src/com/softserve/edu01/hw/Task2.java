package com.softserve.edu01.hw;

import java.util.Scanner;

public class Task2 {
    private static final int COUNT_NUM = 3;

    public void exec(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Task #2");

        for(int i = 0; i < COUNT_NUM; ++i){
            System.out.printf("Enter number #%d: ", i + 1);
            sum += scanner.nextInt();
        }

        double average = (double) sum / COUNT_NUM;

        System.out.printf("The average value is: %.4f\n", average);

        System.out.println("\n\n");
    }
}
