package com.softserve.edu05.pt;

import java.util.Arrays;

public class PascalTriangle {
    public static void main (String[] args) {
        int[][] triangle = new int[6][];

        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
        }

        for (int i = 0; i < triangle.length; i++) {
            int[] curr = triangle[i];

            if (i == 0) {
                curr[0] = 1;
                continue;
            }

            int[] prev = triangle[i - 1];
            curr[0] = 1;
            curr[curr.length - 1] = 1;

            for (int j = 1; j < curr.length - 1; j++) {
                curr[j] = prev[j] + prev[j - 1];
            }
        }

        System.out.println(Arrays.deepToString(triangle));
    }
}
