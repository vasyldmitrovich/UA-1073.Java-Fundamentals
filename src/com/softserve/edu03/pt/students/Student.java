package com.softserve.edu03.pt.students;

public class Student {
    static private int totalRating;
    static private int totalStudents;
    private String name;
    private int rating;

    public Student() {
        this("N/A", 0);
    }
    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        totalStudents++;
        totalRating+=getRating();
    }


    static public double avgRating(){
        return ((double) totalRating / totalStudents);
    }

    static public int getTotalRating(){
        return totalRating;
    }

    public static void printStudentStats() {
        System.out.println("Total rating = " + Student.getTotalRating());
        System.out.println("Avg. rating = " + Student.avgRating());
    }
    public static void promptParameters(Student student) {
        System.out.println("Your name: ");
        String name = Main.SCANNER.nextLine();
        student.setName(name);
        System.out.println("Your rating: ");
        int rating = Main.SCANNER.nextInt();
        Main.SCANNER.nextLine();
        student.setRating(rating);
    }

    public boolean betterStudent(Student other){
        return rating > other.rating;
}

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        totalRating -=this.rating;
        this.rating = rating;
        totalRating +=this.rating;
    }
}
