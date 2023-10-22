package com.softserve.edu08.hw;

class App {//All is good

    public static void main(String[] args) {

//Hw - Student

        // create 2 students
        Student student1 = new Student("Steve", "Jobs", 24, 2);
        Student student2 = new Student("Steve", "Wozniak", 26, 4);
        System.out.printf("%s\n%s\n\n%s\n%s\n", student1.info(), student1.activity(),
                student2.info(), student2.activity());


        // clone 1 student to 3 and output info about them
        Student student3 = student1.clone();
        System.out.println("\nAfter cloning:\nStudent 1 - " + student1.info() +
                "\nStudent 3 - " + student3.info());

        // change data for the student 3. Output both students to console

        student3.setCourse(55555);
        student3.setFirstName("Travolta");
        student3.setAge(88);

        System.out.println("\nAfter changing Student3 fields:\nStudent 3 - " + student3.info() +
                "\nStudent 1 - " + student1.info());
    }
}
