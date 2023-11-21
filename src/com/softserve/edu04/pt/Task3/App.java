package com.softserve.edu04.pt.Task3;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        var scanner = new Scanner(System.in);
        System.out.println("Input the country name: ");
        String countryName = scanner.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println(country + " is on " + country.continent + " continent");

    }

    enum Continent {
        ASIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA, ANTARCTICA, EUROPE, AUSTRALIA;
    }
    enum Country {
        JAPAN(Continent.ASIA), EGYPT(Continent.AFRICA),USA(Continent.NORTH_AMERICA), BRAZIL(Continent.SOUTH_AMERICA), ANTARCTICA(Continent.ANTARCTICA), FRANCE(Continent.EUROPE), AUSTRALIA(Continent.AUSTRALIA);

        final Continent continent;

        Country(Continent continent) {
            this.continent = continent;
        }
    }
}
