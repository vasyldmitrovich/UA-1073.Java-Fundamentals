
package com.softserve.edu04;
import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {//Ok
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть місяць від 1-12 ");
        int month = scanner.nextInt();
        int month1 = days(month);
        if (month >= 1 && month <= 12) {
            System.out.println("У " + month + " місяці " + month1 + " днів");
        }

    }

    private static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static int days(int month) {
        if (month >= 1 && month <= 12) {
            return daysInMonth[month - 1];
        } else {
            System.out.println("Ваше значення повинно бути 1-12");
            return 0;
        }
    }
}


