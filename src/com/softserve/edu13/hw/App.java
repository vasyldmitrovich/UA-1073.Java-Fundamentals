package com.softserve.edu13.hw;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class App {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

//HW 1 - encryption / decryption

//        EncryptionClass.code();

//HW 2 - Create method to validate date according to format "mm.dd.yy"

//        DayValidator.validateToFormat();

//HW 3 - Create method which take year as a parameter and return true if year is a leap

//        checkLeapYear(sc);

//HW 4 - LocalDate birthday - I improve this task

        someMethod(sc);

    }

    private static void someMethod(Scanner sc) {
        Period sixMonth = Period.ofMonths(6);
        Period twelve = Period.ofYears(1);

        System.out.println("Hello, i'll show you some magic :)");

        while (true) {
            try {
                System.out.println("Input year, when you was born:");
                int year = Integer.parseInt(sc.nextLine());
                System.out.println("Input month, when you was born:");
                int month = Integer.parseInt(sc.nextLine());
                System.out.println("Input day, when you was born:");
                int day = Integer.parseInt(sc.nextLine());

                LocalDate birthday = LocalDate.of(year, month, day);

                System.out.println("The day of the week when you was born - " + birthday.getDayOfWeek());
                System.out.println("The day of the week after 6 months you was born - " +
                        birthday.plusMonths(sixMonth.getMonths()).getDayOfWeek());
                System.out.println("the day of the week after 12 months you was born - " +
                        birthday.plusYears(twelve.getYears()).getDayOfWeek());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong input, be patient. Let's try again.");
            }
        }
    }

    private static void checkLeapYear(Scanner sc) {
        while (true) {
            try {
                System.out.println("Input year, and i'll check does it leap(accepting formats - 'yy' or 'yyyy':");
                String input = sc.nextLine();
                int year = Integer.parseInt(input);

// here is method to check
                System.out.println(leapYear(year));


                System.out.println("Input date, and i'll check does this year leap (format - yyyy-MM-dd:");
                String input2 = sc.nextLine();
                int year2 = LocalDate.parse(input2).getYear();
                System.out.println(leapYear(year2));

                break;
            } catch (NumberFormatException e) {
                System.out.println("Wrong format, lets try again");
                ;
            }
        }
    }


    static boolean leapYear(int year) {
        return year % 4 == 0;
    }


}
