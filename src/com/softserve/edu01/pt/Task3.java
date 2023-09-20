package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task3 {
    private static final int NUMBER_PHONE_CALLS = 3;
    public void calculateTotalAmount(){
        Scanner scanner = new Scanner(System.in);
        double[] prices = new double[NUMBER_PHONE_CALLS];
        double[] durationCalls = new double[NUMBER_PHONE_CALLS];
        double[] costCalls = new double[NUMBER_PHONE_CALLS];
        double fullPrice = 0;

        System.out.println("Task #3");

        for(int i = 0; i < NUMBER_PHONE_CALLS; ++i){
            System.out.printf("The cost of a call to the #%d country per minute: ", i + 1);
            prices[i] = scanner.nextDouble();
        }

        System.out.println();

        for(int i = 0; i < NUMBER_PHONE_CALLS; ++i){
            System.out.printf("The duration of a call to country #%d: ", i + 1);
            durationCalls[i] = scanner.nextDouble();
            costCalls[i] = durationCalls[i] * prices[i];
            fullPrice += costCalls[i];
        }

        System.out.println();

        System.out.printf("The total cost of the jingles is: %.3f\n", fullPrice);
        System.out.println("Worth every single call:");

        for(int i = 0; i < NUMBER_PHONE_CALLS; ++i){
            System.out.printf("#%d. Cost: %.3f\n", i + 1, costCalls[i]);
            System.out.printf("\tCost per minute: %.3f\n", prices[i]);
            System.out.printf("\tCall duration: %.3f\n", durationCalls[i]);
        }

        System.out.println("\n\n");
    }
}
