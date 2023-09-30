package com.softserve.edu03.pt.Task1;

import java.util.Scanner;

public class Main {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
      Number first = new Number();
        Number.getNumber(first);
        System.out.println("The sum of " + first.firstnumber + " and " + first.secondnumber + " is " + first.getSum());
        System.out.println( "The average of " + first.firstnumber + " and " + first.secondnumber + " is " + first.getAverage());
    }}
