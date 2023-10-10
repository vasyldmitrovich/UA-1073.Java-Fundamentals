package com.softserve.edu05.hw.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void task3Edu05Hw() {

        List<Car> car = new ArrayList<>();
        car.add(new Car("sedan", 2001, 1.5));
        car.add(new Car("variant", 2008, 1.9));
        car.add(new Car("sport", 2021, 5.0));
        car.add(new Car("cabriolet", 2010, 2.5));

        var scan = new Scanner(System.in);
        System.out.println("Input year of your car: ");
        int inputYearAuto = scan.nextInt();
    }
}
