package com.softserve.edu03.hw;

import java.util.ArrayList;
import java.util.Collections;

public class SmallestInt {

    private ArrayList<Integer> integerArrayList;

    public SmallestInt ()
    {
        this.integerArrayList = new ArrayList<Integer>();
    }

    public void addNumber(int number)
    {
        this.integerArrayList.add(number);
    }

    public int findTheSmallestInt()
    {
        return Collections.min(this.integerArrayList);
    }

}
