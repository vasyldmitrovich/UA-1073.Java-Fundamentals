package com.softserve.edu04.pt;

public enum DayOfTheWeek {
    MONDAY("Monday", "Понеділок"), TUESDAY("Tuesday", "Вівторок"), WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"), FRIDAY("Friday", "П'ятниця"), SATURDAY("Saturday", "Субота"), SUNDAY("Sunday", "Неділя");

    private final String en;
    private final String ua;

    DayOfTheWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }

    public String getDay() {
        return en + "(" + ua + ")";
    }

}
