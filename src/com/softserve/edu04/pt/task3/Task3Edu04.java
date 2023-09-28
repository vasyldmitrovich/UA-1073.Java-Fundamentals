package com.softserve.edu04.pt.task3;
import java.util.Scanner;
public class Task3Edu04 {
    public static void task3Edu04() {
        var scan = new Scanner(System.in);

        System.out.println("Input the country name: ");
        String countryName = scan.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println(country + " belongs to " + country.continent);


    }
}
