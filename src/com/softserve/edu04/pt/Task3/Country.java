package com.softserve.edu04.pt.Task3;

enum Continent {
    ASIA, EUROPE, AMERICA;
}

enum Country {
    JAPAN(Continent.ASIA), UKRAINE(Continent.EUROPE), USA(Continent.AMERICA);

    final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }
}