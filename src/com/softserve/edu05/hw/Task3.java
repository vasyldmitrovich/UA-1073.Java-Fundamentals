package com.softserve.edu05.hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    class Car {
        private String model;
        private int year;
        private double engineSize;

        public Car(String model, int year, double engineSize) {
            this.model = model;
            this.year = year;
            this.engineSize = engineSize;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Модель: " + model + ", Рік випуску: " + year + ", Об'єм двигуна: " + engineSize;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            List<Car> cars = new ArrayList<>();

            for (int i = 0; i < 4; i++) {
                System.out.println("Введіть інформацію про автомобіль " + (i + 1));
                System.out.print("Модель: ");
                String model = scanner.next();
                System.out.print("Рік випуску: ");
                int year = scanner.nextInt();
                System.out.print("Об'єм двигуна: ");
                double engineSize = scanner.nextDouble();

                Car car = new Car(model, year, engineSize);
                cars.add(car);
            }
            Collections.sort(cars, Comparator.comparingInt(Car::getYear));
            System.out.println("Автомобілі відсортовані за роком випуску:");
            for (Car car : cars) {
                System.out.println(car);
            }
        }
    }

}
