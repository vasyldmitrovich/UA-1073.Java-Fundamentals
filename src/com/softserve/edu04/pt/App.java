package com.softserve.edu04.pt;

import java.util.Scanner;

public class App {
    public static Scanner SCANNER = new Scanner(System.in);

    public static void main (String[] args) {
        // Task 2
        System.out.println("Input day of week");
        String response = App.SCANNER.nextLine();
        DayOfWeek day = DayOfWeek.valueOf(response.toUpperCase());

        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні " + day.ua);

        // Task 3

        System.out.println("Input the country name: ");
        String countryName = App.SCANNER.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());

        System.out.println(country.name() + " belongs to " + country.continent);
    }
}
