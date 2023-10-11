package com.softserve.edu05.hw.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1Test {

    @Test
    void main() {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        assertEquals(-1, getDaysInMonth(daysInMonth, 0));
        assertEquals(-1, getDaysInMonth(daysInMonth, 13));
    }

    private int getDaysInMonth(int[] daysInMonth, int month) {
        if (month >= 1 && month <= 12) {
            return daysInMonth[month - 1];
        } else {
            return -1;
        }
    }
}

//Підключив усе правильно, тести працюють, але не дуже вийшло виконати тести до інших завдань.
//Щось виходило, але не пушитиму це. Немає чим похвалитись :)))  Чи могли б ви порадити щось, щоб краще зрощуміти як
//виконувати подібні завдання?. Дякую!



