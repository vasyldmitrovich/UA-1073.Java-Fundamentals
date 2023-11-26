package com.softserve.edu13.hw.task1;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class FullProgram {
    public static void main(String[] args) {
        String originalString = "Я люблю Джаву";
        int shift = 5;

        String encryptedString = encrypt(originalString, shift);
        System.out.println("Encrypted String: " + encryptedString);

        String decryptedString = decrypt(encryptedString, shift);
        System.out.println("Decrypted String: " + decryptedString);

        String dateToValidate = "12.31.21";
        LocalDate parsedDate = isValidDate(dateToValidate);
        if (parsedDate != null) {
            System.out.println("Parsed Date: " + parsedDate);
        } else {
            System.out.println("Invalid Date Format");
        }

        int yearToCheck = 2024;
        System.out.println("Is " + yearToCheck + " a leap year? " + isLeapYear(yearToCheck));

        LocalDate birthday = LocalDate.of(2000, 5, 20);
        printDayOfWeekInfo(birthday);
    }

    public static String encrypt(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                char baseChar = Character.isUpperCase(ch) ? 'А' : 'а';
                char encryptedChar = (char) ((ch - baseChar + n) % 32 + baseChar);
                result.append(encryptedChar);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static String decrypt(String s, int n) {
        return encrypt(s, 32 - n);
    }

    public static LocalDate isValidDate(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.ofPattern("MM.dd.yy"));
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void printDayOfWeekInfo(LocalDate date) {
        System.out.println("Day of the week: " + date.getDayOfWeek());

        LocalDate after6Months = date.plusMonths(6);
        System.out.println("Day of the week after 6 months: " + after6Months.getDayOfWeek());

        LocalDate after12Months = date.plusMonths(12);
        System.out.println("Day of the week after 12 months: " + after12Months.getDayOfWeek());
    }
}
