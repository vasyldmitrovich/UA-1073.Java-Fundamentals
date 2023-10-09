package com.softserve.edu06.pt.task2;

public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Truck("Volvo FH16", 120, 2022),
                new Sedan("Tesla Model 3", 210, 2023),
                new Sedan("Ford Mustang", 250, 2020)
        };

        printRunCar(cars);//Ok
        printStopCar(cars);
        printCarIndo(cars);
    }

    private static void printRunCar(Car[] cars){
        for (Car car : cars) {
            car.run();
            printLine();
        }
    }

    private static void printStopCar(Car[] cars){
        for(Car car : cars){
            car.stop();
            printLine();
        }
    }

    private static void printLine(){
        int length = 20;

        System.out.println();

        for (int i = 0; i < length; ++i){
            System.out.print("*");
        }

        System.out.println();
        System.out.println();
    }

    private static void printCarIndo(Car[] cars){
        System.out.println("Information about cars:");

        for (Car car : cars){
            System.out.printf("\t%s%n", car);
        }
    }
}
