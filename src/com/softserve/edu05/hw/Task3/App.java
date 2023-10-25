package com.softserve.edu05.hw.Task3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        // Create and initialize four instances of Car
        cars.add(new Car("Sedan", 2020, 2.0));
        cars.add(new Car("SUV", 2018, 3.5));
        cars.add(new Car("Hatchback", 2019, 1.8));
        cars.add(new Car("Sports Car", 2022, 5.0));

        // Output cars of a certain model year
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a model year to search for cars: ");
        int modelYear = scanner.nextInt();
        System.out.println("Cars of model year " + modelYear + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == modelYear) {
                System.out.println(car);
            }
        }

        // Sort cars by year of production
        Collections.sort(cars, Comparator.comparingInt(Car::getYearOfProduction));

        System.out.println("\nCars sorted by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}

