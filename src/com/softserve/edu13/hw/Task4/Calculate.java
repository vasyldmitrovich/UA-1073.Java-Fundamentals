package com.softserve.edu13.hw.Task4;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

public class Calculate {
    static void after6Month (LocalDate l) {
        Period period = Period.ofMonths(6);
        LocalDate after6Month = l.plus(period);
        System.out.println(after6Month.getDayOfWeek());
    }
      static void after12Month (LocalDate l) {
        Period period = Period.ofMonths(12);
        LocalDate after6Month = l.plus(period);
        System.out.println(after6Month.getDayOfWeek());
    }

}
