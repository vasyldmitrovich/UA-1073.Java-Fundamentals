package com.softserve.edu01.pt;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
//      Locale.setDefault(Locale.ROOT);
        Scanner scan = new Scanner(System.in);

        System.out.println("Введіть тривалість першого дзвінка у хв.");
        double callTime1 = scan.nextDouble();
        System.out.println("Введіть вартість дзвінка грн/хв.  ");
        double priceCall1 = scan.nextDouble();
        double total1 = callTime1 * priceCall1;

        System.out.println("Введіть тривалість другого дзвінка у хв.");
        double callTime2 = scan.nextDouble();
        System.out.println("Введіть вартість дзвінка грн/хв.  ");
        double priceCall2 = scan.nextDouble();
        double total2 = callTime2 * priceCall2;


        System.out.println("Введіть тривалість третього дзвінка у хв.");
        double callTime3 = scan.nextDouble();
        System.out.println("Введіть вартість дзвінка грн/хв.");
        double priceCall3 = scan.nextDouble();
        double total3 = callTime3 * priceCall3;

        double totalAllCall = total1 + total2 + total3;


        System.out.println("Вартість першого дзвінка:" + (float)total1 + " грн.");
        System.out.println("Вартість другого дзвінка:" + (float)total2+ " грн.");
        System.out.println("Вартість третього дзвінка:" + (float)total3+ " грн.");
        System.out.println("Загальна вартість:" + (float)totalAllCall+ " грн.");



    }
}
