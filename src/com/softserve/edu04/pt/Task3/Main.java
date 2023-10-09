package com.softserve.edu04.pt.Task3;//Write name packages from lowercase

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {//All good
    Scanner scanner = new Scanner(System.in);
        System.out.println("Input the country name");
        String countryName = scanner.nextLine();
        Country country = Country.valueOf(countryName.toUpperCase());
        System.out.println(countryName + " belong to " + country.continent);
    }
}
