package com.softserve.edu05.hw.task3;

import java.util.*;

public class Task3Edu05Hw {
    public static void task3Edu05Hw() {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Sedan", 2010, 1.5));
        cars.add(new Car("Sport", 2020, 5.0));
        cars.add(new Car("Variant", 2008, 1.9));
        cars.add(new Car("Jeep", 2018, 3.0));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a year cars: ");
        int yearCar = scanner.nextInt();

        System.out.println("Cars from year " + yearCar + ":");
        for (Car car : cars) {
            if (car.getYearOfProduction() == yearCar) {
                System.out.println(car);
            }
        }

        Collections.sort(cars, Comparator.comparingInt(car -> car.getYearOfProduction()));

        System.out.println("Sorted cars by year of production:");
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
