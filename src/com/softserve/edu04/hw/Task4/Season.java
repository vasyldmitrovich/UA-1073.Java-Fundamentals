package com.softserve.edu04.hw.Task4;

public enum Season {
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn"),
    WINTER("Winter");

    private String seasonName;

    Season(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getSeasonName() {
        return seasonName;
    }
}
