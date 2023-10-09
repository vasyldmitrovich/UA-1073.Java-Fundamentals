package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

class Car {

    private final String type;
    private final int year;
    private final double engineCapacity;
    private static Car[] collection = new Car[4];//Move this logic to class for example Task1.java
    //This class should only represent entity Car
    private static int count = 0;

    Car(String type, int year, double engineCapacity) {
        this.type = type;
        this.year = year;
        this.engineCapacity = engineCapacity;
        collection[count] = this;
        count++;
    }

    @Override
    public String toString() {
        return "Car - " + type + ", year of production - " + year + ", engine capacity - " + engineCapacity;
    }

    static void findCarsByYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input year of production and i'll show you what cars I have:");
        int tempYear = sc.nextInt();
        int cars = 0;
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].year == tempYear) {
                System.out.println("I have " + collection[i]);
                cars++;
            }
        }
        if (cars == 0) {
            System.out.println("I have no cars of " + tempYear + " year of production");
        }
    }

    static void sortCarsDescendingOrder() {
        System.out.println("Before sort we have - " + Arrays.toString(collection));
        Car temp;
        for (int i = 0; i < collection.length; i++) {
            for (int j = i + 1; j < collection.length; j++) {
                if (collection[i].year < collection[j].year) {
                    temp = collection[i];
                    collection[i] = collection[j];
                    collection[j] = temp;
                }
            }
        }
        System.out.println("After sort we have - " + Arrays.toString(collection));
    }
}
