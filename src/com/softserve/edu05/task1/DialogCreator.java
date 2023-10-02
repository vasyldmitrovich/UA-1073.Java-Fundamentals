package com.softserve.edu05.task1;

import java.util.Scanner;

public class DialogCreator {
    private static final DataProvider dataProvider = new DataProvider();
    private static final Scanner scanner = new Scanner(System.in);

    public void calculateNumberOfDays() {
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.println(month + " month has " + dataProvider.getDaysInMonths(month) + " days.");
        scanner.nextLine();
    }

    public void sumOfFirstFive() {
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();

        }

        scanner.nextLine();

        System.out.println("Sum of elements: " + dataProvider.getFirstFive(numbers));
    }

    public void enterFiveNumbers() {
        System.out.println("Enter 5 numbers: ");

        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Index of second positive number is " + dataProvider.findSecondPositive(numbers));
        System.out.println("Minimum value: " + dataProvider.findMinimum(numbers)[0] +
                " on position " + dataProvider.findMinimum(numbers)[1]);
        System.out.println("Product of all even numbers: " + dataProvider.calculateProduct(numbers));
    }




}
