package com.softserve.edu04.pt.task2;



enum DayOfTheWeek {
    MONDAY("Monday", "Понеділок"), TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"), THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"), SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    final String en;
    final String ua;

    DayOfTheWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }
}

