package com.softserve.edu03.hw;

import com.softserve.common_tools.CommonTools;

public class Task2 {
    public int findMinNumber(){
        int min = Integer.MAX_VALUE;//Good

        for(int i = 1; i <= 5; ++i){
            int enterNum = CommonTools.readLineAndConvertToNumber(String.format("Input the #%d number: ", i), Integer.class);
            min = Math.min(min, enterNum);
        }

        return min;
    }
}
