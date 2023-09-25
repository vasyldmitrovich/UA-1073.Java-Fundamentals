package com.softserve.edu04.pt;

import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        // Task 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of week");
        String response = scanner.nextLine();
        DayOfWeek day = DayOfWeek.valueOf(response.toUpperCase());

        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні " + day.ua);

        // Task 3

        System.out.println("Input the country name: ");
        String countryName = scanner.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());

        System.out.println(country.name() + " belongs to " + country.continent);
    }
}
