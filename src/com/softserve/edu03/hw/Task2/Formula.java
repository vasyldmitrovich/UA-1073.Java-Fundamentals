package com.softserve.edu03.hw.Task2;

public class Formula {
    public int minimum(int a, int b, int c) {//Make method static
        int min;

        if (a <= b && a <= c) {
            min = a;
        } else if (b <= a && b <= c) {
            min = b;
        } else {
            min = c;
        }
        return min;
    }
}
