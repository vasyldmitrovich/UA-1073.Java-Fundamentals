package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task3 {
    public static void task3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input the name of the country: " );
        String countryName = sc.nextLine();

        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println(countryName + " is located in " + country.continent);

    }
}
