package com.softserve.edu09.hw.Task1;

import java.util.List;

public class CollectionUtils {
    public static int findMax(List<Integer> list) {
        int max = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(List<Integer> list) {
        int min = list.get(0);
        for (int num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int findFirstNegative(List<Integer> list) {
        for (int num : list) {
            if (num < 0) {
                return num;
            }
        }
        return 0;
    }
}
