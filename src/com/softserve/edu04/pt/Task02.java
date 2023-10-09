package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task02 {

    enum Days {//Move to file Days.java
        MONDAY("Monday","Понеділок"),
        TUESDAY("Tuesday","Вівторок"),
        WEDNESDAY("Wednesday","Середа"),
        THURSDAY("Thursday","Четвер"),
        FRIDAY("Friday","Пятниця"),
        SATURDAY("Saturday","Субота"),
        SUNDAY("Sunday","Неділя");

        final String en;
        final String ua;

        Days(String en, String ua) {
            this.en = en;
            this.ua = ua;
        }
    }
}
