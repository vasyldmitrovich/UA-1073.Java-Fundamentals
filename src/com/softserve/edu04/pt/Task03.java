package com.softserve.edu04.pt;

public class Task03 {
    enum Continent {//Move to file Continent.java
        ASIA,
        AFRICA,
        AMERICA,
        AUSTRALIA,
        ANTARCTICA,
        EUROPE;



    }
    enum Country{//Move to file Country.java
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
