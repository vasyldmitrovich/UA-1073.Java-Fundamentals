package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task3 {
    public static void task3() {//Ok
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Input the name of the country: ");
                String countryName = sc.nextLine();

                Country country = Country.valueOf(countryName.toUpperCase());
                System.out.println(countryName + " is located in " + country.continent);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong input! Try again.");
            }
        }

    }
}
