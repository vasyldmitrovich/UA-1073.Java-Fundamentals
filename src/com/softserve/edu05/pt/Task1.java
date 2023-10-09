package com.softserve.edu05.pt;

import com.softserve.edu05.CommonTools;

public class Task1 {
    public static double averageValueArray(Double[] array){
        double average = 0;

        for(double el : array){
            average += el;
        }

        return average / array.length;
    }

    public static boolean binarySearchNum(Double[] array, Double num){//Good
        CommonTools.sortArrayBubbleAscendingOrder(array);

        int first = 0;
        int last = array.length - 1;

        while (first < last){
            int middle = (first + last) / 2;

            if(array[middle] > num){
                last = middle - 1;
            }
            else if(array[middle] < num){
                first = middle + 1;
            }
            else {
                return true;
            }
        }

        return false;
    }
}
