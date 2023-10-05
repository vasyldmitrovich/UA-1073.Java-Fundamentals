package com.softserve.edu04.pt;

import java.util.Scanner;

public enum Country {

    ALBANIA(Continent.EUROPE), CHINA(Continent.ASIA), AUSTRALIA(Continent.OCEANIA),
    GERMANY(Continent.EUROPE), UKRAINE(Continent.EUROPE), USA(Continent.NORTH_AMERICA),
    CANADA(Continent.NORTH_AMERICA), BRAZIL(Continent.SOUTH_AMERICA), ARGENTINA(Continent.SOUTH_AMERICA),
    EGYPT(Continent.AFRICA), MOROCCO(Continent.AFRICA), INDIA(Continent.ASIA), SAMOA(Continent.OCEANIA);

    private final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }

    public static void showContinentByCountry () {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Hello. Input country name and i'll show you continent she belongs to.
                (Chose between - Ukraine, Albania, Australia, China,
                USA, Brazil, Germany, Canada, Egypt,
                Argentina, India, Morocco or Samoa)\s""");
        String result = sc.nextLine();
        System.out.println(result + " belongs to " + Country.valueOf(result.toUpperCase()).continent);

    }


    private enum Continent {
        EUROPE, ASIA, OCEANIA, AFRICA, NORTH_AMERICA, SOUTH_AMERICA
    }


}
