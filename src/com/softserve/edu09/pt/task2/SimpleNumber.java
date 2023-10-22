package com.softserve.edu09.pt.task2;

import java.util.SortedSet;
import java.util.TreeSet;

public class SimpleNumber {
    private final SortedSet<Integer> numbers;

    public SimpleNumber() {
        numbers = new TreeSet<>();
    }

    public void addNumbers(String line) throws ConvertException {
        line = line.replaceAll("\\s", "");
        String[] tokens = line.split(",");

        try {
            convert(tokens);
        }
        catch (Exception e){
            throw new ConvertException("The numbers you enter cannot be safely converted to an integer data type.");
        }
    }

    private void convert(String[] tokens) {
        for(var el : tokens){
            numbers.add(Integer.parseInt(el));
        }
    }

    public Integer[] getNumber(){
        return numbers.toArray(new Integer[0]);
    }
}