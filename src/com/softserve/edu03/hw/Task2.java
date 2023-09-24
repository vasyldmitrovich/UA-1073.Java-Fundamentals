package com.softserve.edu03.hw;

import java.util.Scanner;

public class Task2 {
    public int findMinNumber(){
        int min = Integer.MAX_VALUE;

        for(int i = 1; i <= 5; ++i){
            int enterNum = getNumber(String.format("Input the #%d number: ", i));
            min = Math.min(min, enterNum);
        }

        return min;
    }

    private int getNumber(String prompt){
        int enterNum;
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print(prompt);
            if(scanner.hasNextInt()){
                enterNum = scanner.nextInt();
                break;
            }
            else{
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine();
            }
        }

        return enterNum;
    }
}
