package com.softserve.edu04.pt;

public class Task03 {
    enum Continent {
        ASIA,
        AFRICA,
        AMERICA,
        AUSTRALIA,
        ANTARCTICA,
        EUROPE;



    }
    enum Country{
        JAPAN(Continent.ASIA),
        INDIA(Continent.ASIA),
        CHINA(Continent.ASIA),
        NIGERIA(Continent.AFRICA),
        KENYA(Continent.AFRICA),
        MALI(Continent.AFRICA),
        CANADA(Continent.AMERICA),
        BRAZIL(Continent.AMERICA),
        MEXICO(Continent.AMERICA),
        UKRAINE(Continent.EUROPE),
        GREECE(Continent.EUROPE),
        POLAND(Continent.EUROPE);

        Country(Continent continent) {
            this.continent = continent;
        }

        final  Continent continent;



    }
}
