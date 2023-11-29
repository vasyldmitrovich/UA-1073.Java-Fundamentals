package com.softserve.edu13.hw;

import java.time.LocalDate;

public class Birthday {

    public static void main(String[] args) {
        // Створіть змінну LocalDate
        LocalDate birthday = LocalDate.of(1990, 10, 25);

        // Встановіть для змінної дату свого дня народження
        // (Замініть 1990, 10, 25 на свою дату народження)
        birthday = LocalDate.of(2000, 02, 02);

        // Виведіть дату свого дня народження
        System.out.println(birthday);
    }
}