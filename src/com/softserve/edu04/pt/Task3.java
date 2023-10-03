package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the country name ");
        String countryName = scanner.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println( country  +  " belongs to "  +  country.continent );

    }
}

enum Continent{
    EUROPE, AMERICA, ASIA, AFRICA;
}

enum Country{
    UKRAINE(Continent.EUROPE), USA(Continent.AMERICA), INDIA(Continent.ASIA), MAROKKO(Continent.AFRICA);
     final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }
}