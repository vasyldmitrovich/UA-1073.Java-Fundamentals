package com.softserve.edu04.pt;

public enum DayOfWeek {
    MONDAY("Понеділок", "Monday"),
    TUESDAY("Вівторок", "Tuesday"),
    WEDNESDAY("Середа", "Wednesday"),
    THURSDAY("Четвер", "Thursday"),
    FRIDAY("П'ятниця", "Friday"),
    SATURDAY("Субота", "Saturday"),
    SUNDAY("Неділя", "Sunday");

    final String ua;
    final String en;

    DayOfWeek (String ua, String en) {
        this.ua = ua;
        this.en = en;
    }
}
