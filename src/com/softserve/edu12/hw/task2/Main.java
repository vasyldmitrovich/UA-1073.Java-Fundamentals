package com.softserve.edu12.hw.task2;

import com.softserve.common_tools.CommonTools;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int SIZE = 10;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        int start = CommonTools.readLineAndConvertToNumber("Enter the left boundary of the range: ", Integer.class);
        int end = CommonTools.readLineAndConvertToNumber("Enter the right boundary of the range: ", Integer.class);

        while (list.size() < SIZE){
            try{
                int num = readNumber(start, end);
                list.add(num);
                System.out.println("The number is added\n");
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Try again\n");
            }
        }

        System.out.println("You have entered:");
        list.forEach(n -> System.out.printf("%d ", n));
        System.out.println();
    }

    private static int readNumber(int start, int end){
        String line = CommonTools.readLine("Enter num: ");

        try{
            int num = Integer.parseInt(line);

            if(num < start || num > end){
                throw new LimitExceededException(String.format("The number you entered is outside the range [%d, %d].", start, end));
            }

            return num;
        }
        catch (NumberFormatException e){
            throw new NumberFormatException("The string you entered cannot be converted to an integer value.");
        }
    }
}
