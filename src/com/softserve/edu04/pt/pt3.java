package com.softserve.edu04.pt;

import java.util.Scanner;

public class pt3 {
    public enum Continent {
        AFRICA, ASIA, EUROPE, NORTH_AMERICA, SOUTH_AMERICA, AUSTRALIA, ANTARCTICA
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the country: ");
        String countryName = scanner.nextLine();

        Continent continent = getContinentForCountry(countryName);

        if (continent != null) {
            System.out.println("The country " + countryName + " is in the continent " + continent);
        } else {
            System.out.println("Continent information not found for the country " + countryName);
        }

        scanner.close();
    }

    public static Continent getContinentForCountry(String countryName) {
        switch (countryName.toLowerCase()) {
            case "Canada":
            case "United States":
                return Continent.NORTH_AMERICA;
            case "China":
            case "India":
                return Continent.ASIA;
            case "Brazil":
                return Continent.SOUTH_AMERICA;
            case "Nigeria":
                return Continent.AFRICA;
            case "United Kingdom":
            case "Germany":
                return Continent.EUROPE;
            case "Australia":
                return Continent.AUSTRALIA;
            case "Antarctica":
                return Continent.ANTARCTICA;
            default:
                return null; // Country not found in the mapping
        }
    }
}

