package com.softserve.edu07.pt.task2;

public class Cleaner extends Staff {
    public static final String TYPE_PERSON = " i`m cleaner";
    private boolean hasHighCategory;


    public Cleaner(String name, boolean hasHighCategory) {
        super(name);
        this.hasHighCategory = hasHighCategory;
    }

    @Override
    public void salary() {
        int rate = 10000;
        double prize = rate * 0.1;
        double extraPaymentForRank = hasHighCategory ? 1500 : 0;
        double allSalary = rate + prize + extraPaymentForRank;

        System.out.println(TYPE_PERSON + ", my salary is: " + (int) allSalary + " grn/mount.");
    }


}
