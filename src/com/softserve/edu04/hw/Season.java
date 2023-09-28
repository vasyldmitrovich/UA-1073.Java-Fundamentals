package com.softserve.edu04.hw;

public enum Season {
    WINTER("Winter"), SPRING("Spring"),
    SUMMER("Summer"), AUTUMN("Autumn");
    final String season;

    Season(String season) {
        this.season = season;
    }
}
