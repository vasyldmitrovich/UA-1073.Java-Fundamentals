package com.softserve.edu07.pt.task2;

class Teacher extends Staff{
    public static final String TYPE_PERSON = "Teacher";
    private int yearsOfExperience;
    private boolean hasMastersDegree;

    public Teacher(String name, int yearsOfExperience, boolean hasMastersDegree) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
        this.hasMastersDegree = hasMastersDegree;
    }

    @Override
    public void salary() {
        int baseSalary = 40000;
        int bonusPerYear = 2000;
        int mastersDegreeBonus = hasMastersDegree ? 5000 : 0;

        int totalSalary = baseSalary + (yearsOfExperience * bonusPerYear) + mastersDegreeBonus;

        System.out.println(TYPE_PERSON + " " + name + " is a teacher and has a salary of $" + totalSalary + " per year.");
    }
}