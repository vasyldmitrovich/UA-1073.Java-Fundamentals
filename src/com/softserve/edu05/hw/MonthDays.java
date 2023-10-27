package com.softserve.edu05.hw;

import static com.softserve.edu05.hw.App.SCANNER;

public class MonthDays {//Good
    private static final int[] MONTH_DAYS = {
            31, // January
            28, // February
            31, // March
            30, // April
            31, // May
            30, // June
            31, // July
            31, // August
            30, // September
            31, // October
            30, // November
            31  // December
    };

    public void checkDaysInMonth () {
        int monthNumber;
        do {
            System.out.println("Enter a month number");
            monthNumber = App.getNumber();
        } while(!(monthNumber <= 12 && monthNumber >= 1));

        MonthDays.findDayNumber(monthNumber);
    }

    public static int findDayNumber (int month) {
        if (month > MONTH_DAYS.length || month <= 0) {
            return 0;
        }

        return MONTH_DAYS[month - 1];
    }
}
