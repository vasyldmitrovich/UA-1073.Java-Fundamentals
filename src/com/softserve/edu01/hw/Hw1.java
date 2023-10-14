package com.softserve.edu01.hw;

import java.util.*;
import java.lang.*;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a radius of your circle");
        int R = scanner.nextInt();
        double P = Math.PI;
        double R2 = R * R;
        float result = (float) (P * R2);
        System.out.println("result of the area's circle:");
        System.out.println(result);
    }
}


