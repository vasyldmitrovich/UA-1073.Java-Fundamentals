package com.softserve.edu04.pt;

public enum Country {
    UKRAINE(Continent.EUROPE), USA(Continent.AMERICA), FRANCE(Continent.EUROPE), CHINA(Continent.ASIA),
    AUSTRALIA(Continent.AUSTRALIA), TURKEY(Continent.ASIA), ISRAEL(Continent.ASIA), TUNIS(Continent.AFRICA);
    final Continent continent;

    Country(Continent continent) {
        this.continent = continent;
    }

}
