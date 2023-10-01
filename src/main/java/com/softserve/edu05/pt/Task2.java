package com.softserve.edu05.pt;

public class Task2 {
    public static boolean isPrime(int num){
        if(num == 1 || num == 2){
            return true;
        }

        int maxNum = (int) Math.sqrt(num);

        for(int i = 2; i <= maxNum; ++i){
            if(num % i == 0){
                return false;
            }
        }

        return true;
    }
}
