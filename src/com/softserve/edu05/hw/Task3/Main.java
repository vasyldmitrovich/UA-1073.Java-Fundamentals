package com.softserve.edu05.hw.Task3;

import java.util.Locale;
import java.util.Scanner;

import static java.util.Locale.ROOT;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(ROOT);
        Car[] newArrey = Car.createCarsArrey();
        Car.search(newArrey);
        Car.sortByYearOfProduction(newArrey);
        Car.output(newArrey);
    }
}
