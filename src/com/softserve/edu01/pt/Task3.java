package com.softserve.edu01.pt;

import com.softserve.common_tools.CommonTools;

public class Task3 {
    private static final int NUMBER_PHONE_CALLS = 3;
    public void calculateTotalAmount(){
        double fullPrice = 0;

        System.out.println("Task #3");

        double[] prices = readPrice();
        double[] durationCalls = new double[NUMBER_PHONE_CALLS];
        double[] costCalls = new double[NUMBER_PHONE_CALLS];


        for(int i = 0; i < NUMBER_PHONE_CALLS; ++i){
            durationCalls[i] = CommonTools.readLineAndConvertToNumber(String.format("The duration of a call to country #%d: ", i + 1), Double.class);
            costCalls[i] = durationCalls[i] * prices[i];
            fullPrice += costCalls[i];
        }

        System.out.println();

        System.out.printf("The total cost of the jingles is: %.3f%n", fullPrice);

        printFullInfo(costCalls, prices, durationCalls);

        System.out.println("\n\n");
    }

    private double[] readPrice(){
        double[] prices = new double[NUMBER_PHONE_CALLS];

        for(int i = 0; i < NUMBER_PHONE_CALLS; ++i){
            prices[i] = CommonTools.readLineAndConvertToNumber(String.format("The cost of a call to the #%d country per minute: ", i + 1), Double.class);
        }
        System.out.println();

        return prices;
    }

    private void printFullInfo(double[] costCalls, double[] prices, double[] durationCalls){
        System.out.println("Worth every single call:");

        for(int i = 0; i < NUMBER_PHONE_CALLS; ++i){
            System.out.printf("#%d. Cost: %.3f%n", i + 1, costCalls[i]);
            System.out.printf("\tCost per minute: %.3f%n", prices[i]);
            System.out.printf("\tCall duration: %.3f%n", durationCalls[i]);
        }
    }
}
