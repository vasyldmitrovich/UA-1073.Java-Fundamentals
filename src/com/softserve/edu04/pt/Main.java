package com.softserve.edu04.pt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Task01.oddNumbers();
        Scanner scan = new Scanner(System.in);
        System.out.println("Input day of week");
        String response = scan.nextLine();
        Task02.Days day = Task02.Days.valueOf(response.toUpperCase());
        System.out.println("Today is " + day.en);
        System.out.println("Сьогодні  " + day.ua);
        System.out.println("Input the country name");
        String countryName = scan.nextLine();
        Task03.Country country = Task03.Country.valueOf(countryName.toUpperCase());
        System.out.println(country + " belongs to " + country.continent);
    }
}
