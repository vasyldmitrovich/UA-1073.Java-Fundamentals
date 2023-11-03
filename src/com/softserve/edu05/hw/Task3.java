package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void task3() {//Ok
        Car[] cars = new Car[4];
        cars[0] = new Car("Audi", 2010, 1.8);
        cars[1] = new Car("BMW", 2017, 3.0);
        cars[2] = new Car("Golf", 2000, 1.2);
        cars[3] = new Car("Nyva", 1990, 0.8);


        getCarsByYear(cars);

        System.out.println(Arrays.toString(cars));
        sortCarByYear(cars);
        System.out.println(Arrays.toString(cars));

    }

    public static void getCarsByYear(Car[] cars) {
        Scanner sc = new Scanner(System.in);
        int year = 0;
        while (true) {
            try {
                System.out.print("Enter the year of production: ");
                year = Integer.parseInt(sc.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong number! Try again.");
            }
        }
        boolean found = false;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfProduction() == year) {
                System.out.println(cars[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Cars with " + year + " year of production not found.");
        }
    }

    public static void sortCarByYear(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j + 1].getYearOfProduction() > cars[j].getYearOfProduction()) {
                    swap(cars, j, j + 1);
                }
            }
        }
    }

    public static void swap(Car[] cars, int idx1, int idx2) {
        Car tmp = cars[idx1];
        cars[idx1] = cars[idx2];
        cars[idx2] = tmp;
    }
}
