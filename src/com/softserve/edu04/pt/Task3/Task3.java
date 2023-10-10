package com.softserve.edu04.pt.Task3;

import java.util.Scanner;

public class Task3 {
    public static void main() {
        var scanner = new Scanner(System.in);
        System.out.println("Input the country name:");
        String countryName = scanner.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println(country + " belongs to" + country.continent);
    }

}
