package com.softserve.edu04.pt;

import java.util.Scanner;

public class PTask_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input three numbers: ");
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        if(one % 2 != 0) {
            System.out.println(one);
        }
        if(two % 2 != 0) {
            System.out.println(two);
        }
        if(three % 2 != 0){
            System.out.println(three);
        }

    }
}
