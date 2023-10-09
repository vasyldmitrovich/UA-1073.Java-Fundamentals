package com.softserve.edu04.pt;

public enum Country {//Very nice
    UKRAINE(Continent.EUROPE), USA(Continent.AMERICA);

    final Continent continent;

    Country (Continent continent) {
        this.continent = continent;
    }
}