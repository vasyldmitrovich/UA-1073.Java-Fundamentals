package com.softserve.edu04.pt.Task2;

enum DaysOfWeek {//Separate classes in different files
    MONDAY("Monday", "Понеділок"),
    TUESDAY("Tuesday", "Вівторок"),
    WEDNESDAY("Wednesday", "Середа"),
    THURSDAY("Thursday", "Четвер"),
    FRIDAY("Friday", "П'ятниця"),
    SATURDAY("Saturday", "Субота"),
    SUNDAY("Sunday", "Неділя");

    final String en;
    final String ua;

    DaysOfWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }
}