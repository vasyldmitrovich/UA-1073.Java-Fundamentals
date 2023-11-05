package com.softserve.edu12.task1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        div(4,2);
        div(1, 0);
        List<Object> list = new ArrayList<>();
        list.add("null");
        list.add(1);
        System.out.println(list);
    }
    public static void div(double num1, double num2) {

        if (num2 == 0) {
            throw new ArithmeticException("Can't divide on zero!");
        }
        System.out.println("Result: " + num1/num2);


    }
}
