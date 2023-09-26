package com.softserve.edu04.pt;

public enum DayOfWeek {
    SUNDAY("Sunday", "Неділя"), MONDAY("Monday", "Понеділок"), TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"), THURSDAY("Thursday", "Четвер"), FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота");

    final String en;
    final String ua;

    DayOfWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }
}
