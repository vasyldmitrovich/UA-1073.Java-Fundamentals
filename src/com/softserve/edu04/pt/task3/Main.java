package com.softserve.edu04.pt.task3;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Input the country name");
        String countryName = scanner.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println(country + " belongs to " + country.continent);
    }
}

enum Continent{//The same with this enums, move to separate files
    EUROPE, AMERICA
}

enum Country{
    UKRAINE(Continent.EUROPE), USA(Continent.AMERICA);
    final Continent continent;

    Country(Continent continent){
        this.continent = continent;

    }
}
