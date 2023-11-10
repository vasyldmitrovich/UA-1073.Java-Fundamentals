package com.softserve.edu05.hw;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        hw3[] cars = {
                new hw3("Sedan", 2019, 2000),
                new hw3("SUV", 2020, 2500),
                new hw3("Hatchback", 2018, 1800),
                new hw3("Convertible", 2022, 2200)
        };

        System.out.print("Enter a model year: ");
        int inputYear = scanner.nextInt();
        for (hw3 car : cars) {
            if (car.yearOfProduction == inputYear) {
                System.out.println("Car type: " + car.type + ", Engine Capacity: " + car.engineCapacity);
            }
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(a.yearOfProduction, b.yearOfProduction));
        System.out.println("\nCars sorted by year of production:");
        for (hw3 car : cars) {
            System.out.println("Car type: " + car.type + ", Year of Production: " + car.yearOfProduction);
        }

        scanner.close();
    }
}
