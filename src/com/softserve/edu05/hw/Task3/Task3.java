package com.softserve.edu05.hw.Task3;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input information about your car in next line.");

        Car[] cars = new Car[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Car - " + (i + 1) + ":");
            System.out.println("Type of car: ");
            String type = scanner.nextLine();
            System.out.println("Year of production: ");
            int yearProdaction = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Engine capacity: ");
            double engineCapacity = scanner.nextDouble();
            scanner.nextLine();
            cars[i] = new Car(type, yearProdaction, engineCapacity);
        }

        System.out.print("Enter the model year to filter cars: ");
        int modelYear = scanner.nextInt();
        System.out.println("Cars of model year " + modelYear + ":");
        for (Car car : cars) {
            if (car.getYearProdaction() == modelYear) {
                System.out.println(car);
            }
        }
        Arrays.sort(cars, (c1, c2) -> Integer.compare(c1.getYearProdaction(), c2.getYearProdaction()));

        System.out.println("\nCars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }

    }

}
