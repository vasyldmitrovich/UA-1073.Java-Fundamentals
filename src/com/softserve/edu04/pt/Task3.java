package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task3 {
    public static void run() {
        Scanner console = new Scanner(System.in);
        String enteredCountry = console.nextLine();
        Country country = Country.valueOf(enteredCountry.toUpperCase());
        System.out.println(country + " is belong to " + country.continent);
    }
}
