package com.softserve.edu07.pt.task2;

class Cleaner extends Staff {
    public static final String TYPE_PERSON = "Cleaner";
    private int hoursWorked;
    private boolean isFullTime;

    public Cleaner(String name, int hoursWorked, boolean isFullTime) {
        super(name);
        this.hoursWorked = hoursWorked;
        this.isFullTime = isFullTime;
    }

    @Override
    public void salary() {
        double hourlyWage = 12.0;
        double overtimeRate = 18.0;
        double fullTimeBonus = isFullTime ? 500.0 : 0.0;

        double monthlySalary = (hourlyWage * hoursWorked * 4.33) + fullTimeBonus;
        double overtimeHours = Math.max(0, hoursWorked - 160);

        double totalSalary = monthlySalary + (overtimeHours * overtimeRate);

        System.out.println(TYPE_PERSON + " " + name + " is a cleaner and has a salary of $" + totalSalary + " per year.");
    }
}
