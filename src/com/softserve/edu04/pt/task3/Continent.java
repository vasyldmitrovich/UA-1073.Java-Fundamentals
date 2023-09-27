package com.softserve.edu04.pt.task3;

enum Continent {
    ASIA, EURASIA, NORTHAMERICA, SOUTHAMERICA, AUSRALIA, ANTARCTIDA;
}
enum Country {
    UKRAINE(Continent.EURASIA), USA(Continent.NORTHAMERICA), CANADA(Continent.SOUTHAMERICA), FRANCE(Continent.EURASIA), CHINA(Continent.ASIA);

    final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }

}
