package com.softserve.edu07.pt;


import com.softserve.edu07.pt.pt1.Animal;
import com.softserve.edu07.pt.pt1.Cat;
import com.softserve.edu07.pt.pt1.Dog;
import com.softserve.edu07.pt.pt2.Cleaner;
import com.softserve.edu07.pt.pt2.Person;
import com.softserve.edu07.pt.pt2.Student;
import com.softserve.edu07.pt.pt2.Teacher;

public class MyRandomGenerator {

    private static int countStudents = 0;
    private static int countTeachers = 0;
    private static int countCleaners = 0;

    public static Animal getRandomAnimal(int a) {
        return a == 0 ? new Dog() : new Cat();
    }

    public static Person getRandomPerson(int a) {

        switch (a){
            case 1 -> {
                countStudents++;
                return new Student(Student.class.getSimpleName() + " " + countStudents);
            }
            case 2 -> {
                countTeachers++;
                return new Teacher(Teacher.class.getSimpleName() + " " + countTeachers);
            }
            default -> {
                countCleaners++;
                return new Cleaner(Cleaner.class.getSimpleName() + " " + countCleaners);
            }
        }
    }






}
