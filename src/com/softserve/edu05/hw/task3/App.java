package com.softserve.edu05.hw.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        List<Car> car = new ArrayList<>();
        car.add(new Car("Sedan", 2004, 2.5));
        car.add(new Car("Jeep", 1980, 3.5));
        car.add(new Car("Sedan", 2004, 2.0));
        car.add(new Car("Sportcar", 2020, 2.5));

        var scanner = new Scanner(System.in);
        System.out.print("Input year of car: ");
        int carYear = scanner.nextInt();

        System.out.println("All cars by " + carYear + " year:");
        for (Car caar : car) {
            if (carYear == caar.getYearOfProductino()) {
                System.out.println("Type: " + caar.getType() + "  Year of production: " + caar.getYearOfProductino() +
                        "  Engine capacity: " + caar.getEngineCapacity());
            }
        }

        //Good
        Collections.sort(car, (car1, car2) -> Integer.compare(car1.getYearOfProductino(), car2.getYearOfProductino()));
        System.out.println("\nCars in descending order of year of production:");
        for (Car caar : car){
            System.out.println("Type: " + caar.getType() + "  Year of production: " + caar.getYearOfProductino() +
                    "  Engine capacity: " + caar.getEngineCapacity());
        }
    }
}
