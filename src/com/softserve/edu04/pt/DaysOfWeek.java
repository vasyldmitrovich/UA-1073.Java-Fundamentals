package com.softserve.edu04.pt;

import java.util.Scanner;

enum DaysOfWeek {
    MONDAY("Понеділок", "Monday"),
    TUESDAY("Вівторок", "Tuesday"),
    WEDNESDAY("Середа", "Wednesday"),
    THURSDAY("Четвер", "Thursday"),
    FRIDAY("П'ятниця", "Friday"),
    SATURDAY("Субота", "Saturday"),
    SUNDAY("Неділя", "Sunday");

    private final String ua;
    private final String en;

    DaysOfWeek(String ua, String en) {
        this.ua = ua;
        this.en = en;
    }

    @Override
    public String toString() {
        return "Ви обрали " + ua + "(" + en + ")";
    }

    static void dayByNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть порядковий номер дня (інтервал від 1 до 7):");
        int temp = sc.nextInt();


        /**
        *it was my first variant of code
         */
//        String chose = "Ви обрали ";
//        switch (temp) {
//            case 1 -> System.out.println(chose + MONDAY.ua + "(" + MONDAY.en + ")");
//            case 2 -> System.out.println(chose + TUESDAY.ua + "(" + TUESDAY.en + ")");
//            case 3 -> System.out.println(chose + WEDNESDAY.ua + "(" + WEDNESDAY.en + ")");
//            case 4 -> System.out.println(chose + THURSDAY.ua + "(" + THURSDAY.en + ")");
//            case 5 -> System.out.println(chose + FRIDAY.ua + "(" + FRIDAY.en + ")");
//            case 6 -> System.out.println(chose + SATURDAY.ua + "(" + SATURDAY.en + ")");
//            case 7 -> System.out.println(chose + SUNDAY.ua + "(" + SUNDAY.en + ")");
//        }


        /**
         * Then I read about new possibilities of switch expressions and try to implement it
         */
        DaysOfWeek result = switch (temp) {
            case 1 -> MONDAY;
            case 2 -> TUESDAY;
            case 3 -> WEDNESDAY;
            case 4 -> THURSDAY;
            case 5 -> FRIDAY;
            case 6 -> SATURDAY;
            case 7 -> SUNDAY;
            default -> throw new IllegalStateException("я ж просив ввести день тижня в інтервалі від 1 до 7,а було введено - " + temp);
        };

        System.out.println(result);
    }
}
