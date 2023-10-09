package com.softserve.edu05;
import java.util.Arrays;
import java.util.Scanner;

public class hwCar {
    private String carType;
    private int yearOfProduction;
    private double engineCapacity;

    public hwCar(String carType, int yearOfProduction, double engineCapacity) {
        this.carType = carType;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getCarType() {
        return carType;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        hwCar[] cars = {
                new hwCar("Sedan", 2020, 2.0),
                new hwCar("SUV", 2018, 3.5),
                new hwCar("Hatchback", 2021, 1.8),
                new hwCar("Convertible", 2019, 2.5)
        };

        System.out.print("Enter the desired model year: ");
        int targetYear = scanner.nextInt();
        if (targetYear >= 2018 && targetYear <= 2021) {
            System.out.println("Cars of the year " + targetYear + ":");
            for (hwCar car : cars) {
                if (car.getYearOfProduction() == targetYear) {
                    System.out.println(car.getCarType() + " - Engine Capacity: " + car.getEngineCapacity());
                }
            }
    } else {
        System.out.println("No cars of the specified year were found: ");
    }

            Arrays.sort(cars, (car1, car2) -> Integer.compare(car1.getYearOfProduction(), car2.getYearOfProduction()));
            System.out.println("\nCars sorted by year of production:");
            for (hwCar car : cars) {
                System.out.println(car.getCarType() + " - Year: " + car.getYearOfProduction() + ", Engine Capacity: " + car.getEngineCapacity());
            }

            scanner.close();
        }
    }

