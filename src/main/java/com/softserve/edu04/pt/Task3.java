package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task3 {
    public static void printInfoAboutCountry(){
        Scanner scanner = new Scanner(System.in);
        String countryName;
        Country country;

        System.out.print("Enter the name of the country: ");
        countryName = scanner.nextLine();
        countryName = countryName.replace(" ", "_");

        try{
            country = Country.valueOf(countryName.toUpperCase());

            System.out.printf("The country you have selected is %s. It is located on the continent of %s.\n", country.titleEn, country.continent.titleEn);
            System.out.printf("Обрана вами країна - %s. Вона розташована на континенті - %s.\n", country.titleUa, country.continent.titleUa);
        }
        catch (Exception ignore){
            System.out.println("The country you entered is not in the list.");
        }
    }
}

enum Continent{
    ANTARCTICA("Antarctica","Антарктида"),
    NORTH_AMERICA("North America","Північна Америка"),
    SOUTH_AMERICA("South America", "Південна Америка"),
    EUROPE("Europe", "Європа"),
    AFRICA("Africa", "Африка"),
    ASIA("Asia", "Азія"),
    OCEANIA("Oceania", "Океанія");

    public final String titleEn;
    public final String titleUa;

    Continent(String titleEn, String titleUa){
        this.titleEn = titleEn;
        this.titleUa = titleUa;
    }
}

enum Country{
    EGYPT("Egypt", "Єгипет", Continent.AFRICA),
    KENYA("Kenya", "Кенія", Continent.AFRICA),
    SOUTH_AFRICA("South Africa", "Південна Африка", Continent.AFRICA),
    USA("USA", "США", Continent.NORTH_AMERICA),
    CANADA("Canada", "Канада", Continent.NORTH_AMERICA),
    MEXICO("Mexico", "Мексика", Continent.NORTH_AMERICA),
    BRAZIL("Brazil", "Бразилія", Continent.SOUTH_AMERICA),
    ARGENTINA("Argentina", "Аргентина", Continent.SOUTH_AMERICA),
    PERU("Peru", "Перу", Continent.SOUTH_AMERICA),
    CHINE("Chine", "Китай", Continent.ASIA),
    INDIA("India", "Індія", Continent.ASIA),
    JAPAN("Japan", "Японія", Continent.ASIA),
    UKRAINE("Ukraine", "Україна", Continent.EUROPE),
    POLAND("Poland", "Польща", Continent.EUROPE),
    GERMANY("Germany", "Німеччина", Continent.EUROPE),
    AUSTRALIA("Australia", "Австралія", Continent.OCEANIA),
    NEW_ZEALAND("New Zealand", "Нова Зеландія", Continent.OCEANIA),
    FIJI("Fiji", "Фіджі", Continent.OCEANIA);

    public final Continent continent;
    public final String titleEn;
    public final String titleUa;

    Country(String titleEn, String titleUa, Continent continent){
        this.titleEn = titleEn;
        this.titleUa = titleUa;
        this.continent = continent;
    }
}