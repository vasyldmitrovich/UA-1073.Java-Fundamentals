package com.softserve.edu05.hw;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        // Task 1
        MonthDays monthDays = new MonthDays();
        monthDays.checkDaysInMonth();

        int[] integers = IntegerOperations.promptIntegers(10);
        IntegerOperations.performOperations(integers);

        int[] integers1 = FindInteger.promptIntegers(5);
        FindInteger.findSecondPositive(integers1);
        FindInteger.findMinimumValue(integers1);
        FindInteger.findProductOfEven(integers1);

        // Task 2
        SumOfIntegers.findSum();
    }
}
