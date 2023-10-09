package com.softserve.edu05.task3;

import java.util.Arrays;
import java.util.Scanner;

public class App {//All good, nice
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Car[] cars = createInstances();


        sort(cars);

        System.out.println("Sorted: " + Arrays.toString(cars));

        getByYear(cars);

    }

    public static Car getByYear(Car[] cars) {
        System.out.println("Enter a year of production: ");
        for (Car car : cars) {
            if (car.getYearOfProduction() == scanner.nextInt()) {
                return car;
            }
        }
        return null;
    }
    private static Car[] createInstances() {
        Car[] cars = new Car[4];
        for (int i = 0; i < cars.length; i++) {
            System.out.println("====================");
            cars[i] = new Car();
            System.out.println("Enter car type: ");
            cars[i].setType(scanner.nextLine());
            System.out.println("Enter year of production: ");
            cars[i].setYearOfProduction(scanner.nextInt());
            System.out.println("Enter engine capacity: ");
            cars[i].setEngineCapacity(scanner.nextDouble());
            scanner.nextLine();
        }
        return cars;
    }

    public static void sort(Car[] cars) {
        Arrays.sort(cars);
    }
}
