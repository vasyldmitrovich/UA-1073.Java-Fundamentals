package com.softserve.edu05.hw;

import com.softserve.edu05.pt.Employee;

import java.util.Arrays;
import java.util.Scanner;

public class Car {
    public static void main(String[] args) {//Move from here to App.java
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[4];
        cars[0] = new Car("Micro", 2010, 1.2);
        cars[1] = new Car("Hatchback", 2007, 1.6);
        cars[2] = new Car("Sedan", 2018, 3.2);
        cars[3] = new Car("Coupe", 2023,2.0);
        System.out.println("Input the year of manufacture of the vehicle: ");
        int yearCar = scanner.nextInt();
        System.out.println("Year of manufacture of the vehicle " + yearCar + ":");
        for (Car car : cars){
            if(car.getYearOfProduction() == yearCar){
                System.out.println(car.getType());
            }
        }
        Arrays.sort(cars, (e1, e2) -> Double.compare(e2.getYearOfProduction(), e1.getYearOfProduction()));
        for (Car car : cars) {
            System.out.println(car.getType() + " - year of production: " + car.getYearOfProduction());
        }


    }

    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car(String type, int yearOfProduction, double engineCapacity){
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Type: " + getType() + " Year of production: " + getYearOfProduction() + " Engine capacity: " + getEngineCapacity();
    }
}
