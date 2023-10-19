package com.softserve.edu06.pt.task2;

import java.util.ArrayList;

public class Main {
    public static void main() {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Truck("Scania", 85, 2010));
        cars.add(new Truck("Tesla", 90, 2022));
        cars.add(new Sedan("Golf GT", 215, 2018));
        cars.add(new Sedan("Camry", 220, 2019));

        for (Car car : cars) {
            System.out.println("Model: " + car.getModel());
            System.out.println("Max Speed: " + car.getMaxSpeed());
            System.out.println("Year of Production: " + car.getYearOfProduction());
            System.out.println();


        }


    }
}
