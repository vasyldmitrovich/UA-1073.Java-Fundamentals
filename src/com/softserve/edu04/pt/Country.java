package com.softserve.edu04.pt;

public enum Country {//Good
    UKRAINE(Continent.EUROPE), POLAND(Continent.EUROPE), EGYPT(Continent.AFRICA),
    SUDAN(Continent.AFRICA), CHINA(Continent.ASIA), INDIA(Continent.ASIA),
    CANADA(Continent.NORTH_AMERICA), ARGENTINA(Continent.SOUTH_AMERICA);

    final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }
}
