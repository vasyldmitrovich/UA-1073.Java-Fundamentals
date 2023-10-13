package com.softserve.edu05.hw.Task3;


import com.softserve.edu05.pt.Task4.Employee;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.ROOT;

public class Car {

    private String type;
    private int yearOfProduction;
    private double engineCapacity;

    public Car() {
    }

    public Car(String type, int yearOfProduction, double engineCapacity) {
        this.type = type;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", engineCapacity=" + engineCapacity +
                '}';
    }

    static Car[] cars = new Car[4];

    public static Car[] createCarsArrey() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            Locale.setDefault(ROOT);
            System.out.println("Input type of car");
            String type = scanner.nextLine();
            System.out.println("Input year of production");
            int yearOfProduction = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Input engine capacity");
            double engineCapacity = scanner.nextDouble();
            scanner.nextLine();
            cars[i] = new Car(type, yearOfProduction, engineCapacity);
        }  return cars;
    }

    public static void search(Car[]cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year");
        int year = scanner.nextInt();
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getYearOfProduction() == year) {
                System.out.println("In this year " + cars[i].getType() + " created.");
            }
        }
    }


        public static void sortByYearOfProduction(Car[] cars){
            for (int i = 0; i < cars.length - 1; i++) {
                for (int j = 0; j < cars.length - i - 1; j++) {
                    if (cars[j].getYearOfProduction() < cars[j + 1].getYearOfProduction()) {
                        swap(cars, j, j + 1);
                    }
                }
            }
        }
    static void swap(Car[] cars, int j, int i) {
        Car temp = cars[i];
        cars[i] = cars[j];
        cars[j] = temp;
    }
    public static void output(Car[] cars) {
        System.out.println("Sorted by year of production: ");
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
