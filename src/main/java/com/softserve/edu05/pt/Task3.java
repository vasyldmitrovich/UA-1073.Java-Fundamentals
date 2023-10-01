package com.softserve.edu05.pt;

import com.softserve.edu05.CommonTools;

public class Task3 {
    public static int searchMaxNum(Integer[] array){
        CommonTools.sortArrayBubbleAscendingOrder(array);
        return array[array.length - 1];
    }

    public static int sumPositiveNum(Integer[] array){
        int sum = 0;

        CommonTools.sortArrayBubbleAscendingOrder(array);

        for(int i = array.length - 1; i >= 0; --i){
            if(array[i] > 0){
                sum += array[i];
            }
            else {
                break;
            }
        }

        return sum;
    }

    public static String moreNegativeOrPositiveValues(Integer[] array){
        int positive = countPositiveNum(array);
        int negative = countNegativeNum(array);

        if(negative == positive){
            return "There are an equal number of positive and negative values in the array.";
        }
        else if(negative > positive){
            return "There are more negative values in the array.";
        }
        else {
            return "There are more positive values in the array.";
        }
    }

    public static int countNegativeNum(Integer[] array){
        CommonTools.sortArrayBubbleAscendingOrder(array);

        int count = 0;
        for(Integer el : array){
            if(el < 0){
                ++count;
            }
            else {
                break;
            }
        }

        return count;
    }

    public static int countPositiveNum(Integer[] array){
        CommonTools.sortArrayBubbleAscendingOrder(array);

        int count = 0;
        for(int i = array.length - 1; i >= 0; --i){
            if(array[i] > 0){
                ++count;
            }
            else {
                break;
            }
        }

        return count;
    }
}
