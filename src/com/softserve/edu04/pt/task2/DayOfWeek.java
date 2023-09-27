package com.softserve.edu04.pt.task2;

enum DayOfWeek {
    MONDAY("ПОНЕДІЛОК", "MONDAY"), TUESDAY("ВІВТОРОК", "TUESDAY"), WEDNESDAY("СЕРЕДА", "WEDNESDAY"),
    THURSAY("ЧЕТВЕР", "THURSAY"), FRIDAY("П'ЯТНИЦЯ", "FRIDAY"), SATURDAY("СУБОТА", "SATURDAY"),
    SUNDAY("НЕДІЛЯ", "SUNDAY");
    private final String ua;
    private final String en;

    DayOfWeek(String ua, String en) {
        this.ua = ua;
        this.en = en;
    }

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }
}
