package com.softserve.edu05.hw;

import java.util.Scanner;

public class Task3 {
    public static void run() {
        var cars = new Car[4];
        cars[0] = new Car("Toyota Celica", 1995, 3000);
        cars[1] = new Car("Chevrolet Camaro", 2000, 4500);
        cars[2] = new Car("Lamborghini Diablo", 1990, 6000);
        cars[3] = new Car("Bugatti Veyron", 2005, 3000);
        sortByYear(cars);
        printCars(cars);
        System.out.print("Enter year of production: ");
        var console = new Scanner(System.in);
        int enteredYear = console.nextInt();
        console.nextLine();
        printCars(cars, enteredYear);
    }

    static void sortByYear(Car[] cars) {
        for (int i = 0; i < cars.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < cars.length - i - 1; j++) {
                if (cars[j].getProductionYear() > cars[j + 1].getProductionYear()) {
                    var tmp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = tmp;
                    isSwap = true;
                }
            }
            if (!isSwap) {
                break;
            }
        }
    }

    static void printCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

    static void printCars(Car[] cars, int productionYear) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getProductionYear() == productionYear) {
                System.out.println(cars[i].toString());
            }
        }
    }
}
