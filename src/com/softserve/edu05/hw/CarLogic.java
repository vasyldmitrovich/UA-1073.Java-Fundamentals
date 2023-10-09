package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class CarLogic{

    private static Car[] collection = new Car[4];//Move this logic to class for example Task1.java
    //This class should only represent entity Car
    private static int count = 0;

    static void addNewCar(Car car){
        collection[count] = car;
        count++;
    }

    static void findCarsByYear() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input year of production and i'll show you what cars I have:");
        int tempYear = sc.nextInt();
        int cars = 0;
        for (int i = 0; i < collection.length; i++) {
            if (collection[i].getYear() == tempYear) {
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
                if (collection[i].getYear() < collection[j].getYear()) {
                    temp = collection[i];
                    collection[i] = collection[j];
                    collection[j] = temp;
                }
            }
        }
        System.out.println("After sort we have - " + Arrays.toString(collection));
    }

}
