package com.softserve.edu04.pt.Task3;

public enum Country {
    UKRAINE(NameOfContinent.EUROPE),
    USA (NameOfContinent.AMERICA),
    JAPAN (NameOfContinent.ASIA),
    EGYPT (NameOfContinent.AFRICA),
    AUSTRALIA (NameOfContinent.AUSTRALIA);
    final NameOfContinent continent;

    Country(NameOfContinent continent) {
        this.continent = continent;
    }
}
