package com.softserve.edu04.pt.task3;

enum Country {

    UKRAINE(Continent.EUROPE),
    USA(Continent.NORTH_AMERICA),
    ENGLAND(Continent.EUROPE),
    SPAIN(Continent.EUROPE),
    JAPAN(Continent.ASIA),
    LIVIA(Continent.AFRICA),
    MEXICO(Continent.SOUTH_AMERICA);

    final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }
}
