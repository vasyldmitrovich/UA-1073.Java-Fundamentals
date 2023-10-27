package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.InputMismatchException;
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

        // Task 3
        Car car1 = new Car("Sedan", 2020, 2000);
        Car car2 = new Car("SUV", 2019, 2500);
        Car car3 = new Car("Compact", 2022, 1500);
        Car car4 = new Car("Convertible", 2021, 2200);

        Car[] cars = {car1, car2, car3, car4};

        Arrays.sort(cars);
        System.out.println("Sorted cars by year: " + Arrays.toString(cars));

        System.out.println("Enter year");
        int year = SCANNER.nextInt();
        SCANNER.nextLine();

        Car[] carsByYear = Car.filterByYear(cars, year);

        System.out.println("Cars of " + year + " year: " + Arrays.toString(carsByYear));

        // Task 4
        RandomNumber randomNumber = new RandomNumber();
        RandomNumber.guessNumber(randomNumber.getNumber());
    }

    public static int getNumber () {
        boolean isValid = false;
        int res = 0;

        do {
            try {
                res = SCANNER.nextInt();
                SCANNER.nextLine();

                isValid = true;
            } catch (InputMismatchException e) {
                e.printStackTrace();
                SCANNER.nextLine();
            }
        } while (!isValid);

        return res;
    }
}
