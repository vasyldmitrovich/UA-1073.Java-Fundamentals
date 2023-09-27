package com.softserve.edu04.pt.task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input country name: ");
        String countryName = scanner.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println("Country: "+ country.continent);
    }
}
