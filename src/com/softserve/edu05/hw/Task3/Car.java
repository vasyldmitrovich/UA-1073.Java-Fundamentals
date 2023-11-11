package com.softserve.edu05.hw.Task3;

import java.util.Arrays;
import java.util.Scanner;

    public class Car {
        private String type;
        private int yearOfProduction;
        private double engineCapacity;

        public Car(String type, int yearOfProduction, double engineCapacity) {
            this.type = type;
            this.yearOfProduction = yearOfProduction;
            this.engineCapacity = engineCapacity;
        }

        public static void main(String[] args) {
            Car car1 = new Car("Sedan", 2020, 2.0);
            Car car2 = new Car("SUV", 2021, 3.0);
            Car car3 = new Car("Hatchback", 2022, 1.8);
            Car car4 = new Car("Truck", 2019, 1.6);


            outputCarByYear(car1, car2, car3, car4);
            Car[] carsArray = {car1, car2, car3, car4};
            sortCarsByYear(carsArray);
            System.out.println("\nSorted Cars by Year of Production:");
            for (Car car : carsArray) {
                System.out.println(car.toString());
            }
        }

        private static void outputCarByYear(Car... cars) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the year to display cars of that model year: ");
            int yearToDisplay = scanner.nextInt();

            System.out.println("\nCars of model year " + yearToDisplay + ":");
            for (Car car : cars) {
                if (car.yearOfProduction == yearToDisplay) {
                    System.out.println(car.toString());
                }
            }
        }

        private static void sortCarsByYear(Car[] cars) {
            Arrays.sort(cars, (car1, car2) -> Integer.compare(car1.yearOfProduction, car2.yearOfProduction));
        }

        @Override
        public String toString() {
            return "Car{" +
                    "type='" + type + '\'' +
                    ", yearOfProduction=" + yearOfProduction +
                    ", engineCapacity=" + engineCapacity +
                    '}';
        }
    }

