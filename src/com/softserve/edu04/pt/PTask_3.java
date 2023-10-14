package com.softserve.edu04.pt;

import java.util.Scanner;

public class PTask_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the country name: ");
        String countryName = scanner.nextLine();
        Countryy countryy = Countryy.valueOf(countryName.toUpperCase());
        System.out.println(countryy + " belongs to " + countryy.continents);

    }
}

enum Continents {
    ASIA, EUROPE, AMERICA;
}
enum Countryy {
    UKRAINE(Continents.EUROPE),
    USA(Continents.AMERICA);


     final Continents continents;


    Countryy(Continents continents) {
        this.continents = continents;
    }
}
