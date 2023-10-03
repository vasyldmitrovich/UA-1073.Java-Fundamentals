package com.softserve.edu04.pt.Task2;

public enum DayOfWeek {
        DAY1 ("Monday", "Понеділок"),
        DAY2 ("Tuesday", "Вівторок"),
        DAY3 ("Wednesday", "Середа"),
        DAY4 ("Thursday", "Четвер"),
        DAY5 ("Friday", "П'ятниця"),
        DAY6 ("Saturday", "Субота"),
        DAY7 ("Sunday", "Неділя");

        final String en;
        final String ua;

        DayOfWeek(String en, String ua) {
            this.en = en;
            this.ua = ua;
        }
    }

