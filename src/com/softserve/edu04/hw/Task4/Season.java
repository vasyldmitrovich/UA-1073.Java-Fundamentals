package com.softserve.edu04.hw.Task4;

enum Season {//And this enum move to file Season.java
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    final String en;

    Season(String en) {
        this.en = en;
    }
}
