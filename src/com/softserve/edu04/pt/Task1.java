package com.softserve.edu04.pt;

import java.util.Scanner;

public class Task1 {
    private static final int MAX_COUNT_NUM = 3;

    public static void searchOnlyOddNum(){//Ok
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        for(int i = 0; i < MAX_COUNT_NUM; ++i){
            System.out.printf("Enter the number #%d: ", i + 1);
            int num = scanner.nextInt();

            if(num % 2 == 1){
                ++count;
            }
        }

        System.out.printf("The number of odd numbers is: %d\n", count);
    }
}
